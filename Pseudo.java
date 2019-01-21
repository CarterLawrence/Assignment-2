package problem4;

public class Pseudo {
	public static int sum1 (int n){
		int sum;
		int i;
		sum = 0;
		for(i = 0; i < n; i++){
		sum++;
		}
		return sum;
	}
	public static int sum2 (int n){
		int sum;
		int i;
		int j;
		sum = 0;
		for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum3 (int n){
		int sum;
		int i;
		int j;
		sum = 0;
		for(i = 0; i < n; i++){
		for(j = 0; j < n*n; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum4 (int n){
		int sum;
		int i;
		int j;
		sum = 0;
		for(i = 0; i < n; i++){
		for(j = 0; j < i; j++){
		sum++;
		}
		}
		return sum;
	}
	public static int sum5 (int n){
		int sum;
		int i;
		int j;
		int k;
		sum = 0;
		for(i = 0; i < n; i++){
		for(j = 0; j < i*i; j++){
		for(k = 0; k < j; k++){
		sum++;
		}
		}
		}
		return sum;
	}
	public static int sum6 (int n){
		int sum;
		int i;
		int j = 0;
		int k;
		sum = 0;
		for(i = 1; j < n; i++){
		for(j = 1; j < i*i; j++){
		if(j%i == 0){
		for(k = 0; k < j; k++){
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
