Lê Duy Anh - BIT220011 - 22SE1

Bài tập 1:

Cấu trúc thư mục của bài tập:


	├── src
	│   ├── main
	│   │   └── java
	│   │       └── Calculator.java
	│   └── test
	│       └── java
	│           └── CalculatorTest.java
	├── pom.xml
	└── README.md




Trong đó:
	 
   •	Calculator.java là lớp chứa các phương thức tính toán.
	
   •	CalculatorTest.java là lớp kiểm thử các phương thức trong lớp Calculator.

Ở lớp Calculator:
Lớp Calculator cung cấp các phương thức tính toán cơ bản sau:

1. Cộng: Phương thức add(int a, int b) trả về tổng của hai số nguyên a và b.

2. Trừ: Phương thức subtract(int a, int b) trả về hiệu của hai số nguyên a và b.

3. Nhân: Phương thức multiply(int a, int b) trả về tích của hai số nguyên a và b.

4. Chia: Phương thức divide(int a, int b) trả về kết quả của phép chia a cho b dưới dạng số thực. Nếu b == 0, phương thức sẽ ném ra ngoại lệ IllegalArgumentException với thông báo lỗi “Cannot divide by zero”.

5. Tính mũ: Phương thức power(BigDecimal base, int exponent) tính lũy thừa của một số thực base với số mũ exponent và trả về kết quả dưới dạng BigDecimal.
	
6. Tính căn bậc hai: Phương thức sqrt(BigDecimal value) tính căn bậc hai của một số thực value. Nếu giá trị của value là âm, phương thức sẽ ném ra ngoại lệ IllegalArgumentException với thông báo lỗi “Cannot calculate square root of negative number”.

Ở lớp kiểm thử CalculatorTest:

Lớp CalculatorTest chứa các bài kiểm thử cho các phương thức trong lớp Calculator. Mục đích của lớp kiểm thử là đảm bảo rằng các phương thức trong lớp Calculator hoạt động chính xác và phát hiện lỗi trong các phép toán hoặc xử lý ngoại lệ sai. Các bài kiểm thử được thực hiện như sau:

1. Phương thức kiểm thử testAddition():
- Kiểm tra tính chính xác của phép cộng:

 + Kiểm tra xem phép cộng của 2 + 3 có trả về kết quả là 5 không.

 + Kiểm tra phép cộng với số âm, ví dụ -2 + 1 có trả về kết quả là -1 không.

2. Phương thức kiểm thử testSubtraction():

- Kiểm tra tính chính xác của phép trừ:
 
 + Kiểm tra xem phép trừ 3 - 2 có trả về kết quả là 1 không.
 
 + Kiểm tra phép trừ với số âm, ví dụ -2 - 1 có trả về kết quả là -3 không.

3. Phương thức kiểm thử testMultiplication():

- Kiểm tra tính chính xác của phép nhân:

 + Kiểm tra xem phép nhân 2 * 3 có trả về kết quả là 6 không.

 + Kiểm tra phép nhân với số âm, ví dụ -2 * 2 có trả về kết quả là -4 không.

4. Phương thức kiểm thử testDivision():

- Kiểm tra tính chính xác của phép chia:

 + Kiểm tra xem phép chia 4 / 2 có trả về kết quả là 2.0 không.

 + Kiểm tra trường hợp chia cho 0, phương thức phải ném ra ngoại lệ IllegalArgumentException với thông báo “Cannot divide by zero”.

5. Phương thức kiểm thử testPower():

- Kiểm tra tính chính xác của phép tính mũ:

 + Kiểm tra xem phép tính mũ của 2^3 có trả về kết quả là 8 không.

6. Phương thức kiểm thử testSqrt():

- Kiểm tra tính chính xác của phép tính căn bậc hai:

 + Kiểm tra xem căn bậc hai của 4 có trả về kết quả là 2.0 không.

 + Kiểm tra trường hợp đầu vào âm, phương thức phải ném ra ngoại lệ IllegalArgumentException với thông báo “Cannot calculate square root of negative number”.

Kết quả

Nếu tất cả kiểm thử thành công, bạn sẽ thấy thông báo PASSED.

Nếu kiểm thử thất bại, JUnit sẽ thông báo chi tiết lỗi

  ![image](https://github.com/user-attachments/assets/79c89bf6-e325-42ae-b15c-27abc2342a71)




