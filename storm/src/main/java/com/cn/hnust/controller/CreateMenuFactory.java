package com.cn.hnust.controller;

import com.alibaba.fastjson.JSON;
import com.cn.hunst.req.Button;
import com.cn.hunst.req.CommonButton;
import com.cn.hunst.req.ComplexButton;
import com.cn.hunst.req.Menu;

public class CreateMenuFactory {

	public static String create() {
		Menu menu = getMenu();
		String jsonMenu = JSON.toJSONString(menu);
		return jsonMenu;
	}

	private static Menu getMenu() {
		CommonButton btn11 = new CommonButton();
		btn11.setName("天气预报");
		btn11.setType("click");
		btn11.setKey("11");

		CommonButton btn21 = new CommonButton();
		btn21.setName("经典游戏");
		btn21.setType("click");
		btn21.setKey("21");

		CommonButton btn31 = new CommonButton();
		btn31.setName("微社区");
		btn31.setType("click");
		btn31.setKey("31");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("生活助手");
		mainBtn1.setSub_button(new CommonButton[] { btn11 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("娱乐休闲");
		mainBtn2.setSub_button(new CommonButton[] { btn21 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("更多体验");
		mainBtn3.setSub_button(new CommonButton[] { btn31 });

		/**
		 * 
		 * 在某个一级菜单下没有二级菜单的情况，menu该如何定义呢？<br>
		 * 比如，第三个一级菜单项不是“更多体验”，而直接是“幽默笑话”，那么menu应该这样定义：<br>
		 * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 });
		 */
		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}

}
