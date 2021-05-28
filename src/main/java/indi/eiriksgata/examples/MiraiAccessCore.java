package indi.eiriksgata.examples;

import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Path;

/**
 * author: create by Keith
 * version: v1.0
 * description: indi.eiriksgata.examples
 * date: 2021/5/28
 **/
public class MiraiAccessCore extends JavaPlugin {

    public static final MiraiAccessCore INSTANCE = new MiraiAccessCore(); // 可以像 Kotlin 一样静态初始化单例

    private MiraiAccessCore() {
        super(new JvmPluginDescriptionBuilder(
                        "indi.eiriksgata.examples", // name
                        "0.0.1" // version
                )
                        .author("Eirksgata")
                        .info("Mirai console plug examples.")
                        .build()
        );
    }


    //console 退出时的事件
    @Override
    public void onDisable() {

        getLogger().info("Rulateday-Dice quiting...");
    }

    //插件激活时的事件
    @Override
    public void onEnable() {
        //向控制台注册监听事件
        GlobalEventChannel.INSTANCE.registerListenerHost(new MessageEventHandler());


    }

    //载入时
    @Override
    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {

    }

    //以下是实例，选择性使用，这里是直接生成。
    @Nullable
    @Override
    public String getResource(@NotNull String path) {
        return null;
    }

    @Nullable
    @Override
    public String getResource(@NotNull String path, @NotNull Charset charset) {
        return null;
    }

    @NotNull
    @Override
    public File resolveConfigFile(@NotNull Path relativePath) {
        return null;
    }

    @NotNull
    @Override
    public File resolveConfigFile(@NotNull String relativePath) {
        return null;
    }

    @NotNull
    @Override
    public Path resolveConfigPath(@NotNull Path relativePath) {
        return null;
    }

    @NotNull
    @Override
    public Path resolveConfigPath(@NotNull String relativePath) {
        return null;
    }

    @NotNull
    @Override
    public File resolveDataFile(@NotNull Path relativePath) {
        return null;
    }

    @NotNull
    @Override
    public File resolveDataFile(@NotNull String relativePath) {
        return null;
    }

    @NotNull
    @Override
    public Path resolveDataPath(@NotNull Path relativePath) {
        return null;
    }

    @NotNull
    @Override
    public Path resolveDataPath(@NotNull String relativePath) {
        return null;
    }
}
