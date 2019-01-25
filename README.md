在安卓项目中，经常会碰到这样的需求，我们需要在同一台手机上装上同一个App，App内部逻辑一摸一样，但可能对接的后端的接口以及数据库不一致，从而产生多个代码环境，比如测试化境，开发环境，生产环境等等。对于此种需求，我们要面临的问题有以下几个：

1.我们如何写一个配置文件，然后再按需求注释掉不需要的代码，而留下需要的代码。

2.我们如何将配置文件的某些配置被AndroidManifest文件引用，以便在切换环境后产生不同配置

3.我们如何将配置文件的某些配置被代码应用，以便在切换环境后产生不同数据
针对以上问题，我查询了一些资料，在此做个小总结，同时也写了一个非常简易的demo，希望为万能的网友们提供些许参考。

DEMO相关使用介绍：https://blog.csdn.net/blood1093/article/details/84839328
