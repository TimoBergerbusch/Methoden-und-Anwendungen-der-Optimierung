public class cost
{
	
	static int [][] dist = new int [][]{
		{0,	58,	114,51,90,104},
		{58,0,82,45,78,106},
		{114,82,0,63,36,61},
		{51,45,63,0,41,64},
		{90,78,36,41,0,32},
		{104,106,61,64,32,0},
	};
	
	
	public static void main(String[] args){
		if(args.length!=1){
			System.out.println("No argument");
			System.exit(0);
		}
		
		String[] path = args[0].split(",");
		int i=0;
		for(int count=0; count<path.length; count++){
			int index = getIndex(path[count]);
			int tmp = (count+1)%path.length;
			System.out.println(tmp);
			int nextIndex = getIndex(path[tmp]);
			
			i+=dist[index][nextIndex];
		}
		System.out.println("Ergebnis: " + i);
	}
	
	public static int getIndex(String s){
		if(s.equals("a")) return 0;
		if(s.equals("b")) return 1;
		if(s.equals("c")) return 2;
		if(s.equals("d")) return 3;
		if(s.equals("e")) return 4;
		if(s.equals("f")) return 5;
		return -1;
	}
	
}