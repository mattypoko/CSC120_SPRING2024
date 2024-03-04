package Week8;

import java.util.Scanner;

public class Kindle {
    private int totalPages;
    private int currentPage;
    public Kindle(int numberOfPages) {
        totalPages = numberOfPages;
        currentPage = 1;
    }
    public String toString() {
        return "Page " + currentPage + " of " + totalPages + ".";
    }
    public void turnPages() {
        if ((currentPage + 1) <= totalPages) {
            currentPage += 1;
        } else {
            System.out.println("Turning 1 page would take you past the last page.");
        }
    }
    public void turnPages(int pagesToTurn) {
        if ((currentPage + pagesToTurn) <= totalPages) {
            currentPage += pagesToTurn;
        } else {
            System.out.println("Turning " + pagesToTurn + " page(s) would take you past the last page.");
        }
    }
}