# Pokemon By Rock

这是一个试图使用 Java 复制 Pokemon For GBA 的尝试.

我本身Java开发工程师,总是想要复刻一些童年中的游戏,但却没有任何开发游戏的相关经验.

所以,这是个练手学习用的工程,我会借此不断熟悉LibGdx的API和游戏开发逻辑.

这个工程将会一直开发下去,直到我放弃使用Java开发游戏或其他原因.

素材基底基于绿宝石.

学习和灵感来自 : [https://www.youtube.com/playlist?list=PLVOwyy-CHLyrFO9A60_z0Q_x8RfpvgrbM]

![image of the program](https://raw.githubusercontent.com/Rock-Ayl/Rock-Ayl-File.github.io/main/theme.png)

# 起始时间 

2022 10 12

# 环境及依赖

Java 11


Gradle 6.9.2


LibGdx for PC 1.11.0


Apache工具包


阿里FastJson


尽量不用入侵性比较强的东西,比如Lombok之类东西.

# 启动方式

use IDE import build.gradle

run class DesktopLauncher

# 操控方式

方向键控制方向

z:确认/交谈/调查

x:取消/跑步

回车:菜单

空格:加速

# 更新日志

========== 0.0.3 及以前 =======

基础实体的架设等等...

========== 0.0.4 =============

人物基本移动的完善及整理

========== 0.0.5 =============

世界及地图的大纲完善.

========== 0.0.6 =============

比较完整的相机及视角、支持屏幕的拉伸.

========== 0.0.7 =============

一个看起来还不错的对话框UI

========== 0.0.8 ============= 更新于 2023年9月9日

一个可选项框UI

========== 0.0.9 ============= 更新于 2023年9月15日

可以用Json配置地图、事物的的功能,对大型事物增加体积碰撞

========== 0.0.10 ============= 更新于 2023年9月18日

事物可以动了,继续完善未白镇地图,按住空格统一加速(未实现音乐、音效)

========== 0.0.11 ============= 更新于 2023年9月19日

人物与地图块关联起来,修正了一部分UI样式,解决一些bug

========== 0.0.12 ============= 更新于 2023年10月24日

简单的跑,有点动画的瑕疵

========== 0.0.13 ============= 更新于 2023年11月12日

跑步动作优化

========== 0.0.14 ============= 更新于 2023年11月13日

菜单音效

========== 0.0.15 ============= 更新于 2023年11月20日

整理了代码,增加了NPC配置类,优化了载入资源的方式