(function ($) {
    $("pre:not([name='code'])").wrapInner("<span></span>");

$("pre").hover(function() {
    var contentwidth = $(this).contents().width();
    var blockwidth = $(this).width();       
    if(contentwidth > blockwidth) {
        $(this).stop().animate({ width: '950px' }, 250, function(){$(this).css("overflow","auto");});
        }
    }, function() {
        $(this).stop().animate({ width: '597px' }, 250, function(){$(this).css("overflow","hidden");});
});
})(jQuery);