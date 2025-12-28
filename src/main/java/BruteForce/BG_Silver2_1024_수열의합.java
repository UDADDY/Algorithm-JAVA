package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BG_Silver2_1024_수열의합 {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int L = Integer.parseInt(line.split(" ")[1]);

        // L을 100까지 루프 돌리면서 합이 N이 값을 찾는다.
        for(int i=L; i<=100; i++) {
            // 가짓수(L)로 N을 만들 수 있는지 판별
            int[] answer = L로N을만들수있는가(N, i);
            // answer이 null이면 못 찾음
            if(answer == null)
                continue;

            // answer이 null이 아니니 찾음. 그래서 출력 형식으로 바꾸는 작업
            StringBuilder sb = new StringBuilder();
            for(int k=0; k<answer.length; k++) {
                if(k == answer.length - 1) {
                    sb.append(answer[k]);
                } else
                    sb.append(answer[k] + " ");
            }
            System.out.println(sb.toString());
            return;
        }

        // L을 100까지 돌려서 못 찾은 경우는 -1 출력
        System.out.println("-1");

        br.close();
    }

    /**
     * 가짓수(l)로 N을 만들 수 있는지 판별하는 메서드
     */
    public static int[] L로N을만들수있는가(int N, int l) {
        int sum = 0; // 총합을 담는 변수
        int mid = N/l; // 중간 값
        int left; // 리스트의 맨 왼쪽 값. left를 기준으로 오른쪽으로 l개를 더해서 sum을 찾을 거임.

        // l이 짝수인 경우
        if(l % 2 == 0) {
            left = mid - l/2 + 1;

            // left가 0보다 작아지는 경우 제외
            if(left < 0)
                return null;

            // left 기준으로 sum 계산
            for(int j=0; j<l; j++) {
                sum += left + j;
            }
        } else { // l이 홀수인 경우
            left = mid - l/2;
            // left가 0보다 작아지는 경우 제외
            if(left < 0)
                return null;

            // left 기준으로 sum 계산
            for(int j=0; j<l; j++) {
                sum += left + j;
            }
        }

        // sum이 N이면 정답!
        if(sum == N) {
            // 반환할 리스트 생성
            int[] list = new int[l];
            for(int i=0 ; i<l; i++) {
                list[i] = left + i;
            }

            return list;
        }

        // sum이 N이 아니니 못 찾음.
        return null;
    }
}
