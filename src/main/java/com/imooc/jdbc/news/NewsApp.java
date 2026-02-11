package com.imooc.jdbc.news;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NewsApp {
    public static void main(String[] args) throws Exception {
        DataSource ds = DruidUtil.getDataSource();
        NewsDao dao = new NewsDao(ds);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到新闻管理系统");
            System.out.println("=====================");
            System.out.println("1 添加新闻");
            System.out.println("2 查看新闻");
            System.out.println("3 编辑新闻");
            System.out.println("4 删除新闻");
            System.out.println("5 推出系统");
            System.out.print("请输入 1-5 之间的数字进行操作：");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("输入错误，请重新输入 1-5 之间的数字");
                continue;
            }

            if (choice == 5) {
                System.out.println("已退出系统");
                break;
            }
            switch (choice) {
                case 1://添加新闻
                    System.out.println("请输入新闻标题：");
                    String title = scanner.nextLine();
                    System.out.println("请输入新闻内容：");
                    String content = scanner.nextLine();
                    int rows = dao.add(title, content, new Date());
                    if (rows > 0) {
                        System.out.println("添加成功，当前新闻列表：");
                        printAll(dao);
                    } else {
                        System.out.println("添加失败");
                    }
                    break;
                case 2://查看新闻
                    printAll(dao);
                    break;
                case 3://编辑新闻
                    printAll(dao);
                    System.out.println("请输入要编辑的新闻 id:");
                    int editId = Integer.parseInt(scanner.nextLine());
                    News n = dao.findById(editId);
                    if (n == null) {
                        System.out.println("未找到该新闻");
                        break;
                    }
                    System.out.println("新标题（回车则不改）：");
                    String newTitle = scanner.nextLine();
                    if (newTitle.isEmpty()) newTitle = n.getTitle();
                    System.out.println("新内容(回车则不改)：");
                    String newContent = scanner.nextLine();
                    if (newContent.isEmpty()) newContent = n.getContent();
                    dao.update(editId, newTitle, newContent);
                    System.out.println("编辑完成，当前新闻列表：");
                    printAll(dao);
                    break;
                case 4://删除新闻
                    printAll(dao);
                    System.out.println("请输入要删除的新闻 id:");
                    int delId = Integer.parseInt(scanner.nextLine());
                    dao.delete(delId);
                    System.out.println("删除完成，当前新闻列表：");
                    printAll(dao);
                    break;
            }

        }
    }

    private static void printAll(NewsDao dao) throws Exception {
        List<News> list = dao.findAll();
        for (News news : list) {
            System.out.println(news);
        }
    }

}
