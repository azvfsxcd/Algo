package test08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Robot { // 현재 위치 및 방향
	int x, y, d;

	Robot(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.d = d; // 1왼 2아래 3오 4위
	}
}

public class T187_BOJ14503_로봇청소기 {

	static int N, M;
	static int[][] map;
//	static boolean[][] visited; // 필요하려나

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int startx = Integer.parseInt(st.nextToken());
		int starty = Integer.parseInt(st.nextToken());
		int startd = Integer.parseInt(st.nextToken()); // 0 위 1 오 2 아래 3 왼쪽
		Robot robot = new Robot(startx, starty, startd);

		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int cnt = 0;
		map[startx][starty] = 2;	// 청소 후 = 2

		while (true) {
			int d = robot.d - 1;
			if (d == -1) 	d = 3;

			int px = robot.x + dx[d];
			int py = robot.y + dy[d];
			
			if (map[px][py] == 0) {		// 왼쪽 청소해야되면 이동 후 청소
				robot.x = px;
				robot.y = py;
				robot.d = d;
				map[px][py] = 2;
				continue;
			} else if (map[px][py] == 1 || map[px][py] == 2) { // 왼쪽이 벽이거나 청소한 경우

				// 4방향 확인을 위한 check변수
				boolean ck = false;
				
				for (int i = 0; i < 4; i++) {
					int x = robot.x + dx[i];
					int y = robot.y + dy[i];

					// 4방향 벽이거나 청소해야될 경우 true
					if (map[x][y] != 0) {
						ck = true;
					} else { // 한방향이라도 청소해야될 경우 false
						ck = false;
						break;
					}
				}

				// 4방향이 벽이거나 청소한 경우
				if (ck) {
					// 방향에서 뒤로 한칸 이동할 때의 좌표
					int x = robot.x - dx[robot.d];
					int y = robot.y - dy[robot.d];

					// 뒤로 이동하는 곳이 벽일때 반복종료
					if (map[x][y] == 1) {
						break;
					} else { // 뒤로 한칸 이동 가능할 때 이동
						robot.x = x;
						robot.y = y;
						continue;
					}
				} else { // 한방향이라도 청소가능할 때, 방향만 변경
					robot.d = d;
					continue;
				}

			}
		}

		// 지도에서 청소한곳 찾기 (2일때)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 2) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
//		int x = startx;
//		int y = starty;
//		int d = startd;
//		int ck = 0;
//		while(true) {
//			ck = check(x, y, d);
//			
//			if(ck==0) {
//				break;
//			} else if(ck == 1) {
//				
//			}
//		}
//		

//	private static int check(int x, int y, int d) {
//		if() {
//			return 1;
//		} else if() {
//			return 2;
//		}
//		return 0;	// 정지
//		
//	}
}
