package ex03;

public class Coin {
    public static void main(String[] args) {
        // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
        final int money = 120005160; // scanner 로 수정하기
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        int[] moneys = { 500, 100, 50, 10 }; // 0, 1, 2, 3

        for (int i = 0; i < moneys.length; i++) {
            count = restMoney / moneys[i];
            System.out.println(moneys[i] + "원 : " + count);
            restMoney = restMoney % moneys[i];
        }

    }
}
