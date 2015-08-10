import java.io.Console;

import java.util.*;


public class PingPong {
  public static void main(String[] args) {
      Integer myFakeNumber = 16;

      String[] pingPongArray = new String[myFakeNumber];

      for ( Integer index = 0; index < pingPongArray.length; index++) {
          pingPongArray[index] = pingPongValue(index + 1);
          System.out.println(pingPongArray[index]);
      }

  }

  public static String pingPongValue(Integer number) {
      if (number % 3 == 0 && number % 5 == 0) {
          return "ping pong";
      } else if (number % 5 == 0) {
          return "pong";
      } else if (number % 3 == 0) {
          return "ping";
      } else {
          return number.toString();
      }
    }
 }
