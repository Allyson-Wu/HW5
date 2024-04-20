# HW5

目前這個code目的是設計和實作 Lexi 編輯器的文件結構和格式化部分。

作業 #1（Composite 和 Strategy）：
-使用 Composite 和 Strategy 設計模式。
1.完成四個class: Character, Rectangle, Row, Column

作業 #2（Decorator）：
-設計與實作 Lexi 編輯器的裝飾部分。
1.新增邊框(border)和捲軸(scroller)。

作業 #3（AbstractFactory、FactoryMethod 和 Singleton）：
-設計與實作 Lexi 編輯器的外觀部分。
1.添加兩種外觀風格的標籤(Label)和按鈕(Button)：紅色和綠色。
2.使用 AbstractFactory、FactoryMethod 和 Singleton 設計模式。
3.使用環境變數選擇外觀風格。

作業 #4（Bridge）：
-設計與實作 Lexi 編輯器的多視窗系統部分。
1.支援兩種視窗系統：AWT 和 Swing。
2.使用 Bridge 設計模式。
3.使用環境變數選擇視窗系統。

**---未完成---**
作業 #5 命令（Command）、責任鍊（ChainOfResponsibility）和原型（Prototype）:
-設計並實作 Lexi 編輯器的使用者操作部分。
1.接受特定按鍵輸入並執行對應操作：
-按下 "i"：增加字體大小 1。
-按下 "d"：減少字體大小 1。
-按下 "u"：執行撤銷操作。
-按下 "r"：執行重做操作。
2.建置和顯示按鈕，點擊按鈕執行以下操作：
-增加字體大小 1。
-減小字體大小 1。
-設定字體大小為 14。
-設定字體大小為 20。

**---未完成---**
作業 #6: 迭代器（Iterator）和訪問者（Visitor）設計模式，同時使用了命令。
-設計和實現 Lexi 編輯器的文本分析部分，包括計算 Glyph 結構中的單詞。
