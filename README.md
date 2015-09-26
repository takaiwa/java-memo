# java-memo
1つのJavaプロジェクト内に２つのmainメソッドを設けて実行したい方をコマンドで指定するやり方のメモ

HelloWorldクラスの実行方法

    gradle -PmainClass=net.takaiwa.samples.HelloWorld execute

HelloWorld2クラスの実行方法。こちらのクラスは引数の指定もできる。ここでは"hoge"という文字列を渡している。Hello, World2にhogeが追加される

    gradle -PmainClass=net.takaiwa.samples.HelloWorld2 -Dexec.args="hoge" execute
