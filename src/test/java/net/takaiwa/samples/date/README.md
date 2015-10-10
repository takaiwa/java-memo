# net.takaiwa.samples.date
TimeConvertUtilityTestを指定してテストする方法
	gradle test --tests net.takaiwa.samples.date.TimeConvertUtilityTest -PmainClass=net.takaiwa.samples.HelloWorld

※build.gradle的にmainClassを指定してやる必要がある。指定しなくてもいいようにしたい