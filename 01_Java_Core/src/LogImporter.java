import java.io.File;
import java.util.Scanner;

public class LogImporter {
    public static void main(String[] args) {
        System.out.println(">>> BAT DAU DOC LOG TU FILE...");

        try {
            // Định nghĩa file cần đọc
            File fileCanDoc = new File("logs.txt");

            // Tạo máy quét để đọc file
            Scanner mayQuet = new Scanner(fileCanDoc);

            // Đọc từng dòng cho đến hết
            while (mayQuet.hasNextLine()) {
                String dongHienTai = mayQuet.nextLine();
                System.out.println("Dang xu ly: " + dongHienTai);
            }

            // Đóng máy quét (Rất quan trọng để giải phóng RAM)
            mayQuet.close();
            System.out.println(">>> DA DOC XONG!");

        } catch (Exception e) {
            System.out.println("Lỗi rồi! Không tìm thấy file logs.txt đâu cả.");
            System.out.println("Mẹo: M hãy kiểm tra xem đã tạo file logs.txt chưa?");
        }
    }
}