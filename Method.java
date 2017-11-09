import java.io.PrintWriter;
import java.util.Scanner;

public class Method{

   public static void main(String[] args) {
	}
   public static void house() {
        Scanner kbd = new Scanner(System.in);
        int distance = 200, n, m, k, house;
        n = kbd.nextInt();
        m = kbd.nextInt();
        k = kbd.nextInt();
        for(int i = 1; i <= n; i++) {
            house = kbd.nextInt();
            if(house != 0 && house <= k && distance > comp(i - m)) {
                distance = comp(i - m);
            }
        }
        System.out.print(distance * 10);
    }
    
   public static int comp(int x) {
		return x > 0 ? x : -x;
	}

   public static String carrotCake(int n, int t, int k, int d){
	   int a = n;
	   int temp = (int) Math.ceil((double)n/k);

	   int timeTakenNormal = temp*t;
	   int timeTakenOven = d;

	   a=(a-(d/t))*k;

	   while(a>0){
		   a=a-(2*k);
		   timeTakenOven=timeTakenOven + t;
	   } if (k >= n) {
		   return "NO";
	   } else{
		   if(timeTakenNormal > timeTakenOven) {
			   return "YES";
		   }else{
			   return "NO";
		   }
	   }
   }
   
   public static void antonAndDanik(int input, String game) {
        while(input < 1 || input == 0 || input > 100000) {
            if(input < 1 || input == 0) {
                System.out.println("Input should be greater than 1.");
            } else if(input > 100000) {
                System.out.println("Input should be less than 100000.");
            }
        }
        
        int anton = 0;
        int danik = 0;
        
        for(int i = 0; i < game.length(); i++) {
            if(game.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        
        if (anton > danik) {
            System.out.println("Anton");
        } else if(anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
   
   public static void hulk(int number) {
        String line = "";
        int input = number;
        String hulksamaloob = "I hate ";
        String hulksaya = "I love ";
        
        if(input==1){
            line+=hulksamaloob;
            System.out.print(line);
        }else{
            int t = input-1;
            
            for(int i=0;i<input;i++){
                if(i%2==0){
                    line+=hulksamaloob;
                }else{
                    line+=hulksaya;
                }
                
                if(t>=1){
                    line+="that ";
                    t--;
                }
            }
            System.out.print(line+" ");
        }
        System.out.print("it");
    }
   
   public static String method(Scanner input){
		int rounds = input.nextInt();
        int mishka = 0;
        int chris = 0;
        
        for (int i = 0; i < rounds; i++) {
            int m = input.nextInt();
            int c = input.nextInt();
            
            if (m > c) {
                mishka++;
            } else if (c > m) {
                chris++;
            }
            
        }
        
        if (mishka > chris) {
            return "Mishka";
        } else if (mishka < chris) {
            return "Chris";
        } else {
            return "Friendship is magic!^^";
        }
    }
   
   public static void mikeStrings() {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String[]s=new String[n];
            int[][]jl=new int[n][27];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
                for(int j=0;j<s[i].length();j++){
                    jl[i][s[i].charAt(j)-'a']++;
                }
            }
            boolean flag=true;
            for(int i=1;i<n;i++){
                for(int j=0;j<26;j++){
                    if(jl[i][j]!=jl[0][j]){
                        flag=false;
                        break;
                    }
                }
            }
            if(!flag){
                pw.println(-1);
            }else if(n==1){
                pw.println(0);
            }else{
                int min=99999999;
                for(int i=0;i<n;i++){
                    boolean f=true;
                    int sum=0;
                    for(int j=0;j<n;j++){
                        if(j!=i){
                            int re=getdif(s[i],s[j]);
                            if(re==99999999){
                                f=false;
                                break;
                            }
                            sum+=re;
                        }
                    }
                    if(f) min=Math.min(min, sum);
                }
                if(min==99999999)pw.println(-1);
                else pw.println(min);
                
            }
            pw.flush();
        }
    }
   
    public static int getdif(String s,String e){  
        if(s.equals(e))return 0;  
        else{  
            int min=99999999;  
            StringBuilder sb=new StringBuilder();  
            sb.append(s);  
            sb.append(s);  
            for(int i=0;i<sb.length()-e.length();i++){  
                int j;  
                for(j=0;j<e.length();j++){  
                    if(e.charAt(j)!=sb.charAt(i+j)){  
                        break;  
                    }  
                }  
                if(j==e.length())min=Math.min(min, Math.abs(i-j));  
            }  
            return min;  
        }  
    }
}
