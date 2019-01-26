package problem4;

public class Pseudo {
	public static int sum1 (int n){//5N+2, O(N)
		int opCount = 0;
		int sum;
		n = 25;
		sum = 0;//1
		opCount++;
		opCount++;
		opCount++;
		for(int i = 0; i < n; i++){//3N
		sum++;//2N
		opCount += 2;
		opCount += 2;
		opCount++;
		}
		opCount++;
		System.out.println("Operation count for "+n+" : " + opCount);
		return sum;//1
	}
	public static int sum2 (int n){//(5N)(3N+2)=15N^2+10N, O(N^2)
		int sum;
		int opCount2 = 0;
		sum = 0;//1
		n = 25;
		opCount2++;
		opCount2++;
		opCount2++;
		for(int i = 0; i < n; i++){//3N
		opCount2 += 2;
		opCount2++;
		opCount2++;
		opCount2++;
		for(int j = 0; j < n; j++){//3N
		sum++;//2N
		opCount2 += 2;
		opCount2 += 2;
		opCount2++;
		}
		}
		opCount2++;
		System.out.println("Operation count for "+n+" : " + opCount2);
		return sum;//1
	}
	public static int sum3 (int n){//(3N^2+2N)3N+2=9N^3+12N^2+4N, O(N^3)
		int sum;
		int opCount3 = 0;
		sum = 0;//1
		n = 25;
		opCount3++;
		opCount3++;
		opCount3++;
		for(int i = 0; i < n; i++){//3N
		opCount3 += 2;
		opCount3++;
		opCount3++;
		opCount3++;
		for(int j = 0; j < n*n; j++){//3N^2
		sum++;//2N
		opCount3 += 2;
		opCount3 += 2;
		opCount3++;
		}
		}
		opCount3++;
		System.out.println("Operation count for "+n+" : " + opCount3);
		return sum;//1
	}
	public static int sum4 (int n){//(5N)3N+2=15N^2+10N, O(N^2)
		int sum;
		int opCount4 = 0;
		sum = 0;//1
		n = 25;
		opCount4++;
		opCount4++;
		opCount4++;
		for(int i = 0; i < n; i++){//3N
		opCount4 += 2;
		opCount4++;
		opCount4++;
		opCount4++;
		for(int j = 0; j < i; j++){//3N
		sum++;//2N
		opCount4 += 2;
		opCount4 += 2;
		opCount4++;
		}
		}
		opCount4++;
		System.out.println("Operation count for "+n+" : " + opCount4);
		return sum;//1
	}
	public static int sum5 (int n){//(5N)(3N^2)(3N+2)=15N^2(3N+2)=45N^3+30N^2, O(N^3)
		int sum;
		int opCount5 = 0;
		sum = 0;//1
		n = 25;
		opCount5++;
		opCount5++;
		opCount5++;
		for(int i = 0; i < n; i++){//3N
		opCount5 += 2;
		opCount5++;
		opCount5++;
		opCount5++;
		for(int j = 0; j < i*i; j++){//3N^2
		opCount5 += 2;
		opCount5++;
		opCount5++;
		opCount5++;
		for(int k = 0; k < j; k++){//3N
		sum++;//2N
		opCount5 += 2;
		opCount5 += 2;
		opCount5++;
		}
		}
		}
		opCount5++;
		System.out.println("Operation count for "+n+" : " + opCount5);
		return sum;//1
	}
	public static int sum6 (int n){//(5N)(3N^2)(3N+2)=15N^2(3N+2)=45N^3+30N^2, O(N^3)
		int sum;
		int opCount6 = 0;
		sum = 0;//1
		n = 25;
		opCount6++;
		opCount6++;
		opCount6++;
		for(int i = 1; i < n; i++){//3N
		opCount6 += 2;
		opCount6++;
		opCount6++;
		opCount6++;
		for(int j = 1; j < i*i; j++){//3N^2
		opCount6 += 2;
		opCount6++;
		if(j%i == 0){
		opCount6++;
		for(int k = 0; k < j; k++){//3N
		sum++;//2N
		opCount6 += 2;
		opCount6 += 2;
		opCount6++;
		}
		}
		}
		}
		opCount6++;
		System.out.println("Operation count for "+n+" : " + opCount6);
		return sum;//1
		
	}
	public static void main(String[]args){
		System.out.println();
	}
}
