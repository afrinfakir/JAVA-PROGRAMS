package javaSessions;

public class removeJunk {

	public static void main(String[] args) {


		String str="@#$%^&*adsdsjnjhduihduids()(*(*&&^^ffhgfghfh%$%$#";
		String result = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(result);
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}

}
