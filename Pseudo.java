package problem4;

public class Pseudo {
	public static int sum1 (int n){//O(N)
		int sum;
		sum = 0;
		for(int i = 0; i < n; i++){
		sum++;
		}
		return sum;
	}
	public static int sum2 (int n){//O(N^2)
		int sum;
		sum = 0;
		for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum3 (int n){//O(N^3)
		int sum;
		sum = 0;
		for(int i = 0; i < n; i++){
		for(int j = 0; j < n*n; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum4 (int n){//O(N)
		int sum;
		sum = 0;
		for(int i = 0; i < n; i++){
		for(int j = 0; j < i; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum5 (int n){//O(N^3)
		int sum;
		sum = 0;
		for(int i = 0; i < n; i++){
		for(int j = 0; j < i*i; j++){
		for(int k = 0; k < j; k++){
		sum++;
		}
		}
		}
		return sum;
	}
	public static int sum6 (int n){
		int sum;
		int j = 0;
		sum = 0;
		for(int i = 1; j < n; i++){
		for(j = 1; j < i*i; j++){
		if(j%i == 0){
		for(int k = 0; k < j; k++){
		sum++;
		}
		}
		}
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println();
	}
}
