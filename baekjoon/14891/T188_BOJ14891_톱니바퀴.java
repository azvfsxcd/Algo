package test08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T188_BOJ14891_톱니바퀴 {
	static int[] gear1;
	static int[] gear2;
	static int[] gear3;
	static int[] gear4;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		gear1 = new int[8];
		gear2 = new int[8];
		gear3 = new int[8];
		gear4 = new int[8];
		String s = br.readLine();
		char[] ch = s.toCharArray();
		for(int i=0; i<8; i++) {
			gear1[i] = ch[i] -'0';
		}
		s = br.readLine();
		ch = s.toCharArray();
		for(int i=0; i<8; i++) {
			gear2[i] = ch[i] -'0';
		}
		s = br.readLine();
		ch = s.toCharArray();
		for(int i=0; i<8; i++) {
			gear3[i] = ch[i] -'0';
		}
		s = br.readLine();
		ch = s.toCharArray();
		for(int i=0; i<8; i++) {
			gear4[i] = ch[i] -'0';
		}
		
//		ck(gear4);
//		System.out.println(Arrays.toString(gear4));
//		nck(gear4);
//		System.out.println(Arrays.toString(gear4));
		
		int K = Integer.parseInt(br.readLine());
		for(int k = 0; k < K; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());		// 몇번째 바퀴
			int d = Integer.parseInt(st.nextToken());		// 방향 1: 시계, -1: 반시계
			boolean[] c = new boolean[4];
			if(gear1[2]!=gear2[6]) {
				c[1] = true;
			}
			if(gear2[2]!=gear3[6]) {
				c[2] = true;
			}
			if(gear3[2]!=gear4[6]) {
				c[3] = true;
			}
			if(g==1) {
				ch(d, gear1);
				
				if(c[1]) {
					nch(d, gear2);
					if(c[2]) {
						ch(d, gear3);
						if(c[3]) {
							nch(d, gear4);
						}
					}
				}
			} else if(g==2) {
				ch(d, gear2);
				
				if(c[1]) {
					nch(d, gear1);
				}
				
				if(c[2]) {
					nch(d, gear3);
					if(c[3]) {
						ch(d, gear4);
					}
				}
			} else if(g==3) {
				ch(d, gear3);
				
				if(c[2]) {
					nch(d, gear2);
					if(c[1]) {
						ch(d, gear1);
					}
				}
				
				if(c[3]) {
					nch(d, gear4);
				}
				
			} else {
				ch(d, gear4);
				
				if(c[3]) {
					nch(d, gear3);
					if(c[2]) {
						ch(d, gear2);
						if(c[1]) {
							nch(d, gear1);
						}
					}
				}
			}
		}	// for
					
					
		int cnt = 0;
		
		if(gear1[0]==1) {
			cnt+=1;
		}
		if(gear2[0]==1) {
			cnt+=2;
		}
		if(gear3[0]==1) {
			cnt+=4;
		}
		if(gear4[0]==1) {
			cnt+=8;
		}
		
		System.out.println(cnt);
					
					
			

	}
	
	private static void ch(int d, int[] gear) {
		if(d==1) {
			ck(gear);
		} else {
			nck(gear);
		}
	}
	
	private static void nch(int d, int[] gear) {
		if(d==1) {
			nck(gear);
		} else {
			ck(gear);
		}
	}

	private static void ck(int[] gear) {		// 시계
		int temp = gear[7];
		for(int i = 7; i >= 1; i--) {
			gear[i] = gear[i-1];
		}
		gear[0] = temp;
	}
	
	private static void nck(int[] gear) {		// 반시계
		int temp = gear[0];
		for(int i = 0; i < 7; i++) {
			gear[i] = gear[i+1];
		}
//		gear[0] = gear[1];
//		gear[1] = gear[2];
//		gear[2] = gear[3];
//		gear[3] = gear[4];
//		gear[4] = gear[5];
//		gear[5] = gear[6];
//		gear[6] = gear[7];
		gear[7] = temp;
	}

	
	
}
