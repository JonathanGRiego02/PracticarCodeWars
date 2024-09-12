package ejercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestLikes {
  public void test1() {
    assertEquals("no one likes this", Likes.whoLikesIt());
  }

  public void test2() {
    assertEquals("Peter likes this", Likes.whoLikesIt("Peter"));
  }

  public void test3() {
    assertEquals("Jacob and Alex like this", Likes.whoLikesIt("Jacob", "Alex"));
  }

  public void test4() {
    assertEquals("Max, John and Mark like this", Likes.whoLikesIt("Max", "John", "Mark"));
  }

  public void test5() {
    assertEquals("Alex, Jacob and 2 others like this", Likes.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }
}

