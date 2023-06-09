package exam2;

public class DateTest {
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
}
