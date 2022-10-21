/**
 * @Author: HoBoxz (Justin Ho). Site https://github.com/HoBoxz
 * @Contact: E-mail at 2713281947@qq.com.
 * @Website: Repositories https://github.com/HoBoxz/Zero_Java.
 * @Description: The code for the Chapter 02 of Java Zero's study.
 * @LastStudy: P70 - https://www.bilibili.com/video/BV1Rx411876f?p=230&spm_id_from=pageDriver&vd_source=f1611b7fcea8c4a28d295ef2ab3c90df
 */

public class Var {
	
	int z = 114511; // 声明z为成员变量，在方法体外，而方法体内无法访问。

    public static void main(String[] args) {

		int a = 114514; 
			// 声明a为局部变量，只在方法体里面有效。int全名为integer（整数）。故int变量表示的为整数型，且占4个字节。
		a = 114515; 
			//重新为a赋值。*注意：当变量在"同一个域"中重新赋值时，前面不可重复声明，例：int a = 值。
		double b = 3.1415926; 
			// double变量表示的为浮点型（小数类型）。
		boolean c = true; 
			// boolean变量表示的是布尔型，即 true 或 false 两种，分别为真、假。
        
		System.out.println ("因为a+b="+ a+b +"，所以 "+c);

/*
	变量的第一个测试程序：Var是变量
		*注意：在 Java 语言中“数据”被称为“字面量”。

		4.2、变量
		变量的理解
			什么是变量？
				变量就是一个存数据盒子。（盒子大小谁来决定啊？数据类型）
				在内存中的最基本的存储单元。
				存数据用的，而且这个数据是可变的，所以叫做变量。

		变量的使用

			变量的三要素？
				数据类型、变量名、值  （值就是数据，就是字面量。）
				int i = 100;
			
				TODO:1 byte=8 bits
				TODO:1 字节=8 比特位
		变量的分类
			根据位置进行分类：记住就行
				在方法体当中声明的变量叫做局部变量。
					public static void m1(){
						局部变量，方法执行结束之后内存释放。
						int k = 100;
						int i = 200;
					}
				在方法体外以及类体内声明的变量叫做成员变量。
					public class T{
						public static void x(){
						
						}
						 成员变量
						int i = 200;
					}
	
*/
        
    }
    
}
