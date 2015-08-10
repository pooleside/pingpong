import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPongValue_forMultiplesOfThree_ping() {
      PingPong testPingPong = new PingPong();
      assertEquals(testPingPong.pingPongValue(3), "ping");
  }

  @Test
  public void pingPongValue_forMultiplesOfFives_pong() {
      PingPong testPingPong = new PingPong();
      assertEquals(testPingPong.pingPongValue(5), "pong");
  }

  @Test
  public void pingPongValue_forMultiplesOfFiveAndThree_pingpong() {
      PingPong testPingPong = new PingPong();
      assertEquals(testPingPong.pingPongValue(15), "ping pong");
  }

}
