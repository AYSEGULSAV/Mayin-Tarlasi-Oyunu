import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Mayin Tarlasına Hoşgeldiniz");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
		 int row,column;
		 
		 System.out.println("Satir sayisi");
		 row=scan.nextInt();
		 System.out.println("Sütun sayisi");
		 column=scan.nextInt();
		 MayinTarlasi mayin=new MayinTarlasi(row,column);
		 mayin.run();
	}

}
