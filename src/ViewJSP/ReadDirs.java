package ViewJSP;

import java.io.File;
import java.util.ArrayList;



public class ReadDirs {

	public ReadDirs() {
		// TODO Auto-generated constructor stub
	}
	public static class Node{
		public Node(String Dir,String value,int rank)
		{
			this.Dir = Dir;
			this.value=value;
			this.rank=rank;
		}
		public String Dir;
		public String value;
		public int rank;
	}
	public static void  tree(File f,String front,ArrayList<Node> res,int pos){
        //判断传入对象是否为一个文件夹对象& 
    	
        if(!f.isDirectory()){
            System.out.println("你输入的不是一个文件夹，请检查路径是否有误！！");
        }
        else{
            File[] t = f.listFiles();
            for(int i=0;i<t.length;i++){
                //判断文件列表中的对象是否为文件夹对象，如果是则执行tree递归，直到把此文件夹中所有文件输出为止
            	if(!t[i].toString().contains(".svn"))
            	{
	                if(t[i].isDirectory())
	                {
	                   //System.out.println("文件夹"+t[i].getName());
	                   String temp = t[i].getName();
	                   res.add(new Node(front+"/"+t[i].getName(),t[i].getName(),pos));
	                   tree(t[i],front+"/"+temp,res,pos+1);
	                }
	                else
	                {
	                	if(!t[i].toString().contains(".tc~")&&t[i].toString().contains(".tc"))
	                	{
	                		res.add(new Node(front+"/"+t[i].getName(),t[i].getName(),pos));
	                		//System.out.println("文件"+front+"/"+t[i].getName());
	                	}
	                }
            	}
            }
        }
    }

    //显示目录的方法
    public static ArrayList<String> tree(File f){
        //判断传入对象是否为一个文件夹对象& 
    	ArrayList<String> res = new ArrayList<String>();
        if(!f.isDirectory()){
            System.out.println("你输入的不是一个文件夹，请检查路径是否有误！！");
        }
        else{
            File[] t = f.listFiles();
            for(int i=0;i<t.length;i++){
                //判断文件列表中的对象是否为文件夹对象，如果是则执行tree递归，直到把此文件夹中所有文件输出为止
            	if(!t[i].toString().contains(".svn"))
            	{
	                if(t[i].isDirectory())
	                {
	                   System.out.println("文件夹"+t[i].getName());
	                   res.add(t[i].getName().toString());
	                   //tree(t[i],res);
	                }
	                else
	                {
	                	if(t[i].toString().contains(".tc"))
	                	{
	                		System.out.println("文件"+t[i].getName());
	                		res.add(t[i].getName().toString());
	                		
	                	}
	                }
            	}
            }
        }
		return res;
    }
}
