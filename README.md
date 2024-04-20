# HW5

目前這個code目的是設計和實作 Lexi 編輯器的文件結構和格式化部分。

作業 #1（Composite 和 Strategy）：<br>
-使用 Composite 和 Strategy 設計模式。<br>
1.完成四個class: Character, Rectangle, Row, Column<br>
![image](https://github.com/Allyson-Wu/HW5/assets/142470368/ca6c5f5a-50b5-481f-ae21-df065a54bc54)<br>
For example, 這份文檔是一個包含兩行的欄位。第一行包括：一個字元（a）、一個矩形、一個包含三個字元（X、Y 和 Z）的列，以及另一個字元（b）。

作業 #2（Decorator）：<br>
-設計與實作 Lexi 編輯器的裝飾部分。<br>
1.新增邊框(border)和捲軸(scroller)。<br>
For example,<br>
![Screenshot 2024-04-20 152652](https://github.com/Allyson-Wu/HW5/assets/142470368/730ba0c7-91a9-4574-94da-960ffe18bbd6)<br>


作業 #3（AbstractFactory、FactoryMethod 和 Singleton）：<br>
-設計與實作 Lexi 編輯器的外觀部分。<br>
1.添加兩種外觀風格的標籤(Label)和按鈕(Button)：紅色和綠色。<br>
2.使用 AbstractFactory、FactoryMethod 和 Singleton 設計模式。<br>
3.使用環境變數選擇外觀風格。<br>

作業 #4（Bridge）：<br>
-設計與實作 Lexi 編輯器的多視窗系統部分。<br>
1.支援兩種視窗系統：AWT 和 Swing。<br>
2.使用 Bridge 設計模式。<br>
3.使用環境變數選擇視窗系統。<br>

**---未完成---**<br>
作業 #5 命令（Command）、責任鍊（ChainOfResponsibility）和原型（Prototype）:<br>
-設計並實作 Lexi 編輯器的使用者操作部分。<br>
1.接受特定按鍵輸入並執行對應操作：<br>
-按下 "i"：增加字體大小 1。<br>
-按下 "d"：減少字體大小 1。<br>
-按下 "u"：執行撤銷操作。<br>
-按下 "r"：執行重做操作。<br>
2.建置和顯示按鈕，點擊按鈕執行以下操作：<br>
-增加字體大小 1。<br>
-減小字體大小 1。<br>
-設定字體大小為 14。<br>
-設定字體大小為 20。<br>

**---未完成---**<br>
作業 #6: 迭代器（Iterator）和訪問者（Visitor）設計模式，同時使用了命令。<br>
-設計和實現 Lexi 編輯器的文本分析部分，包括計算 Glyph 結構中的單詞。<br>
