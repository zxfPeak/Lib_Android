# Lib_Android
通用的android开发中常见的组件及工具类的依赖库。

工作中用到的一些常见的组件、工具类等的封装。
包括EasyPermission做动态权限
xutils实现网络请求封装
...


使用：
1、将其添加到存储库末尾的root build.gradle中：
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  2、添加依赖项
  dependencies {
	        implementation 'com.github.zxfPeak:Lib_Android:1.0.3'
	}
