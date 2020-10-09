import java.util.Scanner;

public class Tugas1_nomor2{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		String nama, alamat;
		byte umur;
		
		System.out.print("Nama : ");
		nama=input.nextLine();
		System.out.println();
		
		System.out.print("Alamat : ");
		alamat=input.nextLine();
		System.out.println();
		
		System.out.print("Umur : ");
		umur=input.nextByte();
		System.out.println();
		
		
		System.out.println("Nama Anda = "+nama);
		System.out.println("Alamat Anda = "+alamat);
		System.out.println("Umur Anda = "+umur);
	}
}