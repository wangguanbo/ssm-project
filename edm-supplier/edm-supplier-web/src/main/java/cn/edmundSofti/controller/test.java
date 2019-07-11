package cn.edmundSofti.controller;

import org.apdplat.word.WordSegmenter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.apdplat.word.WordSegmenter.segWithStopWords;

public class test {

    public static void main(String[] args) {
        /*long startTime = System.currentTimeMillis();
        WordSegmenter.seg("周三立今天下午喝完2两白酒之后要去呷脯呷脯搓一顿").stream().forEach(System.out::println);
        System.out.println("所用时间"+(System.currentTimeMillis()-startTime));*/
        test2();
    }

    private static void test2() {

        long var0 = System.currentTimeMillis();
        ArrayList var2 = new ArrayList();
        var2.add("杨尚川是APDPlat应用级产品开发平台的作者");
        var2.add("他说的确实在理");
        var2.add("提高人民生活水平");
        var2.add("他俩儿谈恋爱是从头年元月开始的");
        var2.add("王府饭店的设施和服务是一流的");
        var2.add("和服务于三日后裁制完毕，并呈送将军府中");
        var2.add("研究生命的起源");
        var2.add("他明天起身去北京");
        var2.add("在这些企业中国有企业有十个");
        var2.add("他站起身来");
        var2.add("他们是来查金泰撞人那件事的");
        var2.add("行侠仗义的查金泰远近闻名");
        var2.add("长春市长春节致辞");
        var2.add("他从马上摔下来了,你马上下来一下");
        var2.add("乒乓球拍卖完了");
        var2.add("咬死猎人的狗");
        var2.add("地面积了厚厚的雪");
        var2.add("这几块地面积还真不小");
        var2.add("大学生活象白纸");
        var2.add("结合成分子式");
        var2.add("有意见分歧");
        var2.add("发展中国家兔的计划");
        var2.add("明天他将来北京");
        var2.add("税收制度将来会更完善");
        var2.add("依靠群众才能做好工作");
        var2.add("现在是施展才能的好机会");
        var2.add("把手举起来");
        var2.add("请把手拿开");
        var2.add("这个门把手坏了");
        var2.add("茶杯的把手断了");
        var2.add("将军任命了一名中将");
        var2.add("产量三年中将增长两倍");
        var2.add("以新的姿态出现在世界东方");
        var2.add("使节约粮食进一步形成风气");
        var2.add("反映了一个人的精神面貌");
        var2.add("美国加州大学的科学家发现");
        var2.add("我好不挺好");
        var2.add("木有");
        var2.add("下雨天留客天天留我不留");
        var2.add("叔叔亲了我妈妈也亲了我");
        var2.add("白马非马");
        var2.add("学生会写文章");
        var2.add("张掖市民陈军");
        var2.add("张掖市明乐县");
        var2.add("中华人民共和国万岁万岁万万岁");
        var2.add("word是一个中文分词项目，作者是杨尚川，杨尚川的英文名叫ysc");
        var2.add("江阴毛纺厂成立了保持党员先进性爱国主义学习小组,在江阴道路管理局协助下,通过宝鸡巴士公司,与蒙牛酸酸乳房山分销点组成了开放性交互式的讨论组, 认为google退出中国事件赤裸裸体现了帝国主义的文化侵略,掀起了爱国主义的群众性高潮。");
        var2.add("工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作");
        var2.add("商品和服务");
        var2.add("结婚的和尚未结婚的");
        var2.add("买水果然后来世博园");
        var2.add("中国的首都是北京");
        var2.add("老师说明天下午休息");
        var2.add("今天下雨");
        int var3 = 1;
        Iterator var4 = var2.iterator();


        while(var4.hasNext()) {
            String var5 = (String)var4.next();
            List var6 = segWithStopWords(var5);
            var6.stream().forEach(System.out::println);
            System.out.println("--------------------");
        }

        long var7 = System.currentTimeMillis() - var0;
        System.out.println("耗时: " + var7 + " 毫秒");

    }
}
