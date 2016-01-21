
#从数组索引中找出当前数据包中的协议类型
proc findProtocolType {retVal packetName} {
    upvar #0 $packetName inArr        ;#定义全局数组的引用
    upvar $retVal inVar               ;#定义返回值
    set ll [array names inArr]
    foreach id $ll {                  ;#变量数组索引名,其形式为"IPv6,Version"
        set ls [split $id ","]        ;#用','分隔
        set value [lindex $ls 0]      ;#取得索引0的值
        set pos [string first $value $inVar]	;#判断inVar是否已包含该类型
        if {$pos == "-1"} {           ;#判断是否已经包含此协议类型
            append value ","
            append inVar $value
        }
    }
    #return $inVar
}

#封装IPv6层数据包
proc createIPv6 {packetName} {
    set type ""
    findProtocolType type $packetName    ;#找到当前数据包所包含的协议头
    set names [split $type ","]
    foreach protocol $names {
        switch -exact -- $protocol {
            "ICMPv6" {
                uip6 ICMP $packetName    ;#uip6协议栈封装ipv6,icmpv6,数据保存到
                                         ;#packetName(data)数组变量中
            }
	    "UDP" {
		uip6 UDP $packetName	 ;#uip6协议栈封装ipv6,udp,数据保存到
                                         ;#packetName(data)数组变量中
	    }
            default {}
        }
    }
}

#封装RPL数据包
proc createRPL {packetName} {
    set type ""
    findProtocolType type $packetName    ;#找到当前数据包所包含的协议头
    set names [split $type ","]
    foreach protocol $names {
        switch -exact -- $protocol {
            "DIO" {
                rpl RPL $packetName    ;#uip6协议栈封装ipv6,icmpv6,数据保存到
                                         ;#packetName(data)数组变量中
            }
            default {}
        }
    }
}

#封装6LowPAN层数据包
proc create6LoWPAN {packetName} {
    createIPv6 $packetName          ;#创建IPv6数据包
    6lowpan $packetName             ;#把IPv6数据包封装成6lowpan   
}

#register dissector
register_data_dissector
register_ieee802154_dissector
register_6lowpan_dissector
register_ipv6_dissector
register_icmpv6_dissector
register_udp_dissector