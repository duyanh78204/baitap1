Lê Duy Anh - BIT220011 - 22SE1

Bài tập 1:

Cấu trúc thư mục của bài tập:


<img width="363" alt="Screenshot 2025-01-07 at 08 50 46" src="https://github.com/user-attachments/assets/e6891bac-7511-4cfd-a193-73cb0982d743" />




Trong đó:
	 
   •	Calculator.java là lớp chứa các phương thức tính toán.
	
   •	CalculatorTest.java là lớp kiểm thử các phương thức trong lớp Calculator.

Ở lớp Calculator:
Đây là lớp thực hiện các phép toán cơ bản, trong đó:
1. add(int a, int b): Trả về tổng của hai số a và b.
   
2. subtract(int a, int b): Trả về hiệu của hai số a và b.
   
3. multiply(int a, int b): Trả về tích của hai số a và b.
   
4. divide(int a, int b):

Trả về kết quả của phép chia a cho b dưới dạng số thực.

Nếu b == 0, phương thức sẽ ném ra ngoại lệ IllegalArgumentException với thông báo "Cannot divide by zero".

Ở lớp kiểm thử CalculatorTest:

  Mục đích: 

Đảm bảo rằng các phương thức trong lớp Calculator hoạt động chính xác.

Phát hiện lỗi trong các phép toán hoặc xử lý ngoại lệ sai.
  
Với từng phương thức kiểm thử:

1. Phương thức testAddition()

Kiểm tra tính chính xác của phương thức add():

assertEquals(5, calculator.add(2, 3)): Kiểm tra xem 2 + 3 có trả về 5 không.

assertEquals(-1, calculator.add(-2, 1)): Kiểm tra phép cộng với số âm (-2 + 1 = -1).

2. Phương thức testSubtraction()

Kiểm tra tính chính xác của phương thức subtract():

assertEquals(1, calculator.subtract(3, 2)): Kiểm tra xem 3 - 2 có trả về 1 không.

assertEquals(-3, calculator.subtract(-2, 1)): Kiểm tra phép trừ với số âm (-2 - 1 = -3).

3. Phương thức testMultiplication()

Kiểm tra tính chính xác của phương thức multiply():

assertEquals(6, calculator.multiply(2, 3)): Kiểm tra xem 2 * 3 có trả về 6 không.

assertEquals(-4, calculator.multiply(-2, 2)): Kiểm tra phép nhân với số âm (-2 * 2 = -4).

4. Phương thức testDivision()

Kiểm tra tính chính xác của phương thức divide():

assertEquals(2.0, calculator.divide(4, 2)): Kiểm tra phép chia 4 / 2 = 2.0.

assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0)): Kiểm tra rằng ngoại lệ IllegalArgumentException được ném ra khi chia 1 cho 0.
  
Kết quả

Nếu tất cả kiểm thử thành công, bạn sẽ thấy thông báo PASSED.

Nếu kiểm thử thất bại, JUnit sẽ thông báo chi tiết lỗi
   <img width="1512" alt="Screenshot 2025-01-06 at 09 23 24" src="https://github.com/user-attachments/assets/5bfe6af7-8b64-4f55-ac8d-ff1a6b3a5117" />


Tài liệu tham khảo:

https://chatgpt.com/share/677b3dfe-be98-8002-8b49-eb178f68f689
