package ex05.exam;

import java.util.Scanner;

class Cal2 {
    String date;

    int x, y, z;

    public void cal(int change1, int change2, int change3) {

        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8);

        x = Integer.parseInt(year);
        y = Integer.parseInt(month);
        z = Integer.parseInt(day);

        if (change1 == change1 && change2 == 0 && change3 == 0) {
            x = change1;
        } else if (change1 == 0 && change2 == change2 && change3 == 0) {
            y = change2;
        } else if (change1 == 0 && change2 == 0 && change3 == change3) {
            z = change3;
        }

        int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] changemonth = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            lastday[1] = 29;
            if (1 < z && z <= lastday[y - 1]) {
                if (1 <= y && y < 10) { // 0 + z // 1 <= z && z < 10
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + "0" + y + "-" + "0" + z);
                    } else {
                        System.out.println(x + "-" + "0" + y + "-" + z);
                    }
                } else {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + y + "-" + "0" + z);
                    } else {
                        System.out.println(x + "-" + y + "-" + z);
                    }
                }
            } else if (z > lastday[y - 1]) {
                if (1 <= y && y < 10) {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + "0" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    } else {
                        System.out.println(x + "-" + "0" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    }
                } else {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    } else {
                        System.out.println(x + "-" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    }
                }
            }
        } else {
            lastday[1] = 28;
            if (1 < z && z <= lastday[y - 1]) {
                if (1 <= y && y < 10) { // 0 + z // 1 <= z && z < 10
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + "0" + y + "-" + "0" + z);
                    } else {
                        System.out.println(x + "-" + "0" + y + "-" + z);
                    }
                } else {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + y + "-" + "0" + z);
                    } else {
                        System.out.println(x + "-" + y + "-" + z);
                    }
                }
            } else if (z > lastday[y - 1]) {
                if (1 <= y && y < 10) {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + "0" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    } else {
                        System.out.println(x + "-" + "0" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    }
                } else {
                    if (1 <= z && z < 10) {
                        System.out.println(x + "-" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    } else {
                        System.out.println(x + "-" + changemonth[y] + "-" + "0" + (z - lastday[y - 1]));
                    }
                }
            }
        }
    }

    public static class CalenderSelecter {
        public static void main(String[] args) {
            Cal2 c2 = new Cal2();
            Scanner sc = new Scanner(System.in);

            System.out.println("날짜를 입력해주세요 : 입력형식 xxxx-xx-xx");
            c2.date = sc.nextLine();

            System.out.println("변경을 원하시는 부분을 입력해주세요 : year, month, day 중 선택");
            String type = sc.nextLine();
            System.out.println("변경을 원하시는 값을 입력해주세요 : ");
            int interval = sc.nextInt();

            String year1 = "year";
            String month1 = "month";
            String day1 = "day";

            if (type.equals(year1)) {
                c2.cal(interval, 0, 0);
            } else if (type.equals(month1)) {
                c2.cal(0, interval, 0);
            } else if (type.equals(day1)) {
                c2.cal(0, 0, interval);
            }

        }
    }

}
