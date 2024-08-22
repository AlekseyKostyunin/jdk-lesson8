package org.example;

import java.io.IOException;
import java.util.Scanner;

public class MultiThreadedDownloader {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Укажите количество потоков для скачивания: ");
        Scanner in = new Scanner(System.in);
        int numThreads = in.nextInt(); // Получаем количество потоков из аргументов командной строки
        String inputFile = "files/to_download.txt";
        String outputFile = "files/downloads/";
        Downloader.downloadFromFile(numThreads, inputFile, outputFile);
    }

}
