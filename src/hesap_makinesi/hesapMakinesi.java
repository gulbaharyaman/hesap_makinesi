package hesap_makinesi;

import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {

		int a,b,islem;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme\n");
		System.out.println("hangi işlemi yapmak istiyorsunuz:");
		
		islem=input.nextInt();
		System.out.println("lütfen ilk sayıyı giriniz");
		a=input.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz");
		b=input.nextInt();
		
		if(islem==1) {
			System.out.println("işleminizin sonucu: "+(a+b));
		}else if(islem==2) {
			System.out.println("işleminizin sonucu: "+(a-b));
		}else if(islem==3) {
			System.out.println("işleminizin sonucu: "+(a*b));
		}else if(islem==4) {
			if(b==0) {
				System.out.println("sonuç belirsizdir");
			}else {
				System.out.println("işleminizin sonucu: "+(a/b));
			}
		}else {
			System.out.println("geçersiz işlem giridniz");
		}

	}

}
