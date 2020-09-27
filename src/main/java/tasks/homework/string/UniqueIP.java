package main.java.tasks.homework.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueIP {
    //Task написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
    //ip 212.168.101.5: ok - 3, failed - 2

    public static void main(String[] args) {
        uniqueIp();
    }

    private static String text = "access_log.2020.09.07 212.168.101.5 granted access_log.2020.09.07 212.168.101.6 denied access_log.2020.09.07 212.168.101.5 granted access_log.2020.09.07 212.168.101.6 denied";

    private static void uniqueIp() {
        String[] st = text.split(" ");

        List<Connection> connections = new ArrayList<>();

        for (int i = 0; i <= st.length - 3; i = i + 3) {

            String[] strings = Arrays.copyOfRange(st, i, i + 3);
            Connection connection = new Connection();
            connection.ip = strings[1];
            connection.result = strings[2];
            connections.add(connection);
        }
        System.out.println(connections);
        Map<String, List<Connection>> collect = connections.stream().collect(Collectors.groupingBy(Connection::getIp, Collectors.toList()));
        System.out.println(collect);

        for (String ip : collect.keySet()) {
            List<Connection> connectionList = collect.get(ip);

            int ok = 0;
            int failed = 0;

            for (Connection connection : connectionList) {

                if (connection.result.equals("granted")) {
                    ++ok;
                }
                if (connection.result.equals("denied")) {
                    ++failed;
                }
            }
            //ip 212.168.101.5: ok - 3, failed - 2
            System.out.println("");
            System.out.println("ip " + connectionList.get(0).ip + ": ok - " + ok + ", " + "failed - " + failed);
        }
    }

    public static class Connection {

        public String ip;
        public String result;

        public String getIp() {
            return ip;
        }

        public String getResult() {
            return result;
        }

        @Override
        public String toString() {
            return "Connection{" +
                    "iP='" + ip + '\'' +
                    ", result='" + result + '\'' +
                    '}';
        }
    }
}
