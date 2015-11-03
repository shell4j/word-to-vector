package vecModel;

import java.io.IOException;

public class testModel {
	//java -XX:-UseGCOverheadLimit -Xmx30G -jar test.jar /home/yhuang/work/mymodel1022.txt(读入vect模型的文件目录)
  public static void main(String[] args) throws IOException{
		String s1="the";
		String s2="was";
		//double dd = Double.valueOf("123.2");
		//System.out.println(dd);
		vecModel vm=new vecModel();
		String s=null;
		s=args[0];
		//if(s==null)
		//	s="/home/shell/work/test";
		vm.loadModel(s);
		vm.getVec(s1);
		vm.getVec(s2);
		System.out.println(vm.getSim(s1, s2));
	
  }

}
