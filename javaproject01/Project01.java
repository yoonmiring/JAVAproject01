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

   // ũ�Ѹ� �� URL
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
      } // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[4]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[1]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num1 = 1;
      System.out.print("\"" + num1 + "��\",");
      // ���� ����
      String title1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title1 + "\",");
      // ��������
      String score1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score1 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people1 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people1 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 2��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[2]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num2 = 2;
      System.out.print("\"" + num2 + "��\",");
      // ���� ����
      String title2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title2 + "\",");
      // ��������
      String score2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score2 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people2 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people2 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 3��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[3]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num3 = 3;
      System.out.print(("\"" + num3 + "��\","));
      // ���� ����
      String title3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title3 + "\",");
      // ��������
      String score3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score3 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people3 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people3 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 4��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[4]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num4 = 4;
      System.out.print(("\"" + num4 + "��\","));
      // ���� ����
      String title4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title4 + "\",");
      // ��������
      String score4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score4 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people4 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people4 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 5��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[5]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num5 = 5;
      System.out.print(("\"" + num5 + "��\","));
      // ���� ����
      String title5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title5 + "\",");
      // ��������
      String score5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score5 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people5 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people5 + "\",");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 6��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[6]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num6 = 6;
      System.out.print(("\"" + num6 + "��\","));
      // ���� ����
      String title6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title6 + "\",");
      // ��������
      String score6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score6 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people6 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people6 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 7��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[7]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num7 = 7;
      System.out.print(("\"" + num7 + "��\","));
      // ���� ����
      String title7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title7 + "\",");
      // ��������
      String score7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score7 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people7 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people7 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 8��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[8]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num8 = 8;
      System.out.print(("\"" + num8 + "��\","));
      // ���� ����
      String title8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title8 + "\",");
      // ��������
      String score8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score8 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people8 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people8 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 9��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[9]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num9 = 9;
      System.out.print(("\"" + num9 + "��\","));
      // ���� ����
      String title9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title9 + "\",");
      // ��������
      String score9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score9 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people9 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people9 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 10��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[10]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num10 = 10;
      System.out.print(("\"" + num10 + "��\","));
      // ���� ����
      String title10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title10 + "\",");
      // ��������
      String score10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score10 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people10 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people10 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 11��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[11]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num11 = 11;
      System.out.print(("\"" + num11 + "��\","));
      // ���� ����
      String title11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title11 + "\",");
      // ��������
      String score11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score11 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people11 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people11 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 12��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[12]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num12 = 12;
      System.out.print(("\"" + num12 + "��\","));
      // ���� ����
      String title12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title12 + "\",");
      // ��������
      String score12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score12 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people12 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people12 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 13��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[13]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num13 = 13;
      System.out.print(("\"" + num13 + "��\","));
      // ���� ����
      String title13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title13 + "\",");
      // ��������
      String score13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score13 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people13 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people13 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 14��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[14]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num14 = 14;
      System.out.print("\"" + num14 + "��\",");
      // ���� ����
      String title14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title14 + "\",");
      // ��������
      String score14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score14 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
      String people14 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[1]/strong/span")).getText();
      System.out.println("\"" + people14 + "\"");

      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // 15��
      // ��ŷ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // �ڽ����ǽ� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/nav/ul/li[2]/ul/li[2]/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();

      } // ��ȭ Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/ol/li[15]/div/div[2]/strong/a")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ��ŷǥ��
      int num15 = 15;
      System.out.print(("\"" + num15 + "��\","));
      // ���� ����
      String title15 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
      System.out.print("\"" + title15 + "\",");
      // ��������
      String score15 = driver
            .findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd"))
            .getText();
      System.out.print("\"" + score15 + "\",");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���� Ŭ��
      driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[1]/ul/li[4]/a/span")).click();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      // ���ο� ����
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
         String data = "\"" + num[i] + "��\"," + "\"" + title[i] + "\"," + "\"" + score[i] + "\"," + "\"" + people[i]
               + "\"\n";
         fw.write(data);
      }
      fw.close();
   }

}