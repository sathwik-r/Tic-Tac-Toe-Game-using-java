import java.util.Scanner;
import java.io.*;
public class TicTacToe{
 public static int playerone(int  a,int b,int c,int d,int e,int f,int g ,int h ,int i){  // conditions for player one to win
	if(a==1 && b==1 && c==1) return 1;
	if(d==1 && e==1 && f==1) return 1;
	if(g==1 && h==1 && i==1) return 1;
	if(a==1 && d==1 && g==1) return 1;
	if(b==1 && e==1 && h==1) return 1;
	if(c==1 && f==1 && i==1) return 1;
	if(a==1 && e==1 && i==1) return 1;
	if(c==1 && e==1 && g==1) return 1;
		return 0;
}
 public static int playertwo(int  a,int b,int c,int d,int e,int f,int g ,int h ,int i){  // conditions for player two to win
	if(a==2 && b==2 && c==2) return 1;
	if(d==2 && e==2 && f==2) return 1;
	if(g==2 && h==2 && i==2) return 1;
	if(a==2 && d==2 && g==2) return 1;
	if(b==2 && e==2 && h==2) return 1;
	if(c==2 && f==2 && i==2) return 1;
	if(a==2 && e==2 && i==2) return 1;
	if(c==2 && e==2 && g==2) return 1;
		return 0;
}
public static void NewGame(){     //class NewGame
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	int f=0;
	int g=0;
	int h=0;
	int i=0;

	Scanner sc=new Scanner(System.in);
	int count=0;
	while(count<9){
		System.out.println("player one:choose your number");
		int x=sc.nextInt();
		count++;

		if(x==1) a=1;
		else if(x==2) b=1;
		else if(x==3) c=1;
		else if(x==4) d=1;
		else if(x==5) e=1;
		else if(x==6) f=1;
		else if(x==7) g=1;
		else if(x==8) h=1;
		else i=1;
		System.out.println(a+" | "+b+" | "+c);
		System.out.println(d+" | "+e+" | "+f);
		System.out.println(g+" | "+h+" | "+i);
		int one=playerone(a,b,c,d,e,f,g,h,i);
		if(one==1){
			System.out.println("player one won");
			count--;
			break;
		}

		System.out.println("player two:choose your number");
		int y=sc.nextInt();
		count++;
		if(y==1) a=2;
		else if(y==2) b=2;
		else if(y==3) c=2;
		else if(y==4) d=2;
		else if(y==5) e=2;
		else if(y==6) f=2;
		else if(y==7) g=2;
		else if(y==8) h=2;
		else i=2;
		System.out.println(a+" | "+b+" | "+c);
		System.out.println(d+" | "+e+" | "+f);
		System.out.println(g+" | "+h+" | "+i);
		int two=playertwo(a,b,c,d,e,f,g,h,i);
		if(two==1){
			System.out.println("player two won");
			count--;
			break;
		}

}
		if(count==8){
		System.out.println("Game Drawn");
		}

}
 public static void main(String args[]){
	System.out.println("Welcome to Two player version....The board numbers are as follows");
	System.out.println("1  |  2  |  3  ");
	System.out.println("4  |  5  |  6  ");
	System.out.println("7  |  8  |  9  ");
  	NewGame();
	System.out.println("enter 1 to play again");    // asking user for rematch
	System.out.println("enter 0 to play exit");
	Scanner sa=new Scanner(System.in);
	int check=sa.nextInt();
	if(check==1){
		NewGame();
	}

	}
}
