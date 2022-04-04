package javaproject01;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project01 {

   // WebDriver
   private static WebDriver driver;

   // Properties
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";

   // 크롤링 할 URL
   private static String base_url;

   public static void main(String[] args) throws IOException {

      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

      // Driver SetUp
      driver = new ChromeDriver();
      base_url = "https://movie.daum.net/main";
      driver.get(base_url);
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[4]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[1]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num1 = 1;
      System.out.print("\"" + num1 + "위\",");
      // 제목 추출
      String title1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title1 + "\",");
      // 평점추출
      String score1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score1 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people1 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 2위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[2]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num2 = 2;
      System.out.print("\"" + num2 + "위\",");
      // 제목 추출
      String title2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title2 + "\",");
      // 평점추출
      String score2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score2 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people2 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 3위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[3]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num3 = 3;
      System.out.print(("\"" + num3 + "위\","));
      // 제목 추출
      String title3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title3 + "\",");
      // 평점추출
      String score3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score3 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people3 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 4위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[4]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num4 = 4;
      System.out.print(("\"" + num4 + "위\","));
      // 제목 추출
      String title4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title4 + "\",");
      // 평점추출
      String score4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score4 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people4 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 5위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[5]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num5 = 5;
      System.out.print(("\"" + num5 + "위\","));
      // 제목 추출
      String title5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title5 + "\",");
      // 평점추출
      String score5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score5 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people5 + "\",");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 6위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[6]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num6 = 6;
      System.out.print(("\"" + num6 + "위\","));
      // 제목 추출
      String title6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title6 + "\",");
      // 평점추출
      String score6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score6 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people6 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 7위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[7]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num7 = 7;
      System.out.print(("\"" + num7 + "위\","));
      // 제목 추출
      String title7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title7 + "\",");
      // 평점추출
      String score7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score7 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people7 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 8위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[8]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num8 = 8;
      System.out.print(("\"" + num8 + "위\","));
      // 제목 추출
      String title8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title8 + "\",");
      // 평점추출
      String score8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score8 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people8 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 9위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[9]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num9 = 9;
      System.out.print(("\"" + num9 + "위\","));
      // 제목 추출
      String title9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title9 + "\",");
      // 평점추출
      String score9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score9 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people9 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 10위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[10]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num10 = 10;
      System.out.print(("\"" + num10 + "위\","));
      // 제목 추출
      String title10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title10 + "\",");
      // 평점추출
      String score10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score10 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people10 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 11위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[11]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num11 = 11;
      System.out.print(("\"" + num11 + "위\","));
      // 제목 추출
      String title11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title11 + "\",");
      // 평점추출
      String score11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score11 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people11 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 12위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[12]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num12 = 12;
      System.out.print(("\"" + num12 + "위\","));
      // 제목 추출
      String title12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title12 + "\",");
      // 평점추출
      String score12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score12 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people12 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 13위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[13]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num13 = 13;
      System.out.print(("\"" + num13 + "위\","));
      // 제목 추출
      String title13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title13 + "\",");
      // 평점추출
      String score13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score13 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people13 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 14위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[14]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num14 = 14;
      System.out.print("\"" + num14 + "위\",");
      // 제목 추출
      String title14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title14 + "\",");
      // 평점추출
      String score14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score14 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people14 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 15위
      // 랭킹 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // 박스오피스 클릭
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // 영화 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[15]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 랭킹표시
      int num15 = 15;
      System.out.print(("\"" + num15 + "위\","));
      // 제목 추출
      String title15 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title15 + "\",");
      // 평점추출
      String score15 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score15 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평점 클릭
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 평가인원 추출
      String people15 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people15 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      int[] num = { num1, num2,num3,num4,num5,num6,num7,num8,num9,num10, num11, num12,num13,num14, num15 };
      String[] title = { title1, title2,title3,title4,title5,title6,title7,title8,title9,title10,title11,title12,title13,title14,title15 };
      String[] score = { score1, score2 ,score3,score4,score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15};
      String[] people = { people1, people2,people3,people4,people5,people6,people7,people8,people9,people10,people11,people12,people13,people14,people15 };

      FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\data.csv", true);
      for (int i = 0; i < 15; i++) {
         String data = "\"" + num[i] + "위\"," + "\"" + title[i] + "\"," + "\"" + score[i] + "\"," + "\"" + people[i]
               + "\"\n";
         fw.write(data);
      }
      fw.close();
   }

}