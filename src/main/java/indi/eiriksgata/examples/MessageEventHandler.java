package indi.eiriksgata.examples;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;


/**
 * author: create by Keith
 * version: v1.0
 * description: indi.eiriksgata.examples
 * date: 2021/5/28
 **/
public class MessageEventHandler extends SimpleListenerHost {

    //群接受消息事件
    @EventHandler()
    public ListeningStatus OnGroupMessageEvent(GroupMessageEvent event) {
        //你可以通过查阅GroupTempMessage的接口了解功能

        //例如获得发言人发送的消息
        String reread = event.getMessage().contentToString();

        //判断是不是你好
        if (reread.equals("你好")){

            //直接复读发到群里
            event.getGroup().sendMessage(reread);

        }


        return ListeningStatus.LISTENING;
    }


    //用户私聊消息事件
    @EventHandler()
    public ListeningStatus onFriendMessage(FriendMessageEvent event) {

        //当用户发送hello 则回复Hello！
        if (event.getMessage().contentToString().equals("hello")) {
            event.getSender().sendMessage("Hello!");
        }

        return ListeningStatus.LISTENING;

    }

}
