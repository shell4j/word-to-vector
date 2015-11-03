package vecModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class vecModel {
	public HashMap<String ,String> hmap=new HashMap<String,String>();
	public static int vecSize=100;
	public void loadModel(String ifilePath) throws IOException{
		if(ifilePath==null) ifilePath="/home/shell/work/out";
		
		FileReader fr=new FileReader(ifilePath);
		BufferedReader br=new BufferedReader(fr);
		String s=null;
		String[] sArray=new String[101];
		while((s=br.readLine())!=null){
			sArray=s.split(" ");
			if(sArray.length==(vecSize+1)&&(sArray[0]!=null))
			    hmap.put(sArray[0], s);
		}//while
	}//loadModel
	public double[] getVec(String s){
		double[] d=new double[vecSize];
		String s1=null;
		String[] ss=new String[vecSize+1];
		if(hmap.containsKey(s)){
			ss=hmap.get(s).split(" ");
			for(int i=1;i<ss.length;i++){
				//System.out.print(ss[i]+"\t");
				d[i-1]=Double.valueOf(ss[i]);
			}
			//System.out.println();
		}	
			
		
		return d;
	}
	
	public double getSim(String s1,String s2){
		double[] value1=new double[vecSize];
		double[] value2=new double[vecSize];
		if(hmap.containsKey(s1)&&hmap.containsKey(s2)){
			value1=getVec(s1);
			value2=getVec(s2);
		}//if 
		else{
			System.out.println("word not found!");
			return 1;
		}
		double s=0;
		double ss1=0;
		double ss2=0;
		for(int i=0;i<vecSize;i++){
			ss1+=value1[i]*value1[i];
			ss2+=value2[i]*value2[i];
			s+=value1[i]*value2[i];
		}
		if(Math.sqrt(ss1*ss2)==0){
			System.out.println("0 Error!");
			return 1;
		}
		else return (s/Math.sqrt(ss1*ss2));
	}

}
