H2HDR/
├── .github/
│   └── workflows/
│       └── build-apk.yml            <-- Actions 自动化脚本
├── app/
│   ├── build.gradle.kts             <-- App 模块配置
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml  <-- 清单文件
│           └── java/
│               └── com/
│                   └── eazz/
│                       └── h2hdr/
│                           ├── MainActivity.kt
│                           └── core/
│                               └── HdrConverter.kt
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── build.gradle.kts                 <-- 根目录构建配置
└── settings.gradle.kts              <-- 模块设置
