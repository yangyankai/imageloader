/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/10/30 6:38:15
 * Project: T_imageloader
 * File: Constants.java
 * Class: Constants
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

/*******************************************************************************
 * Copyright 2011-2013 Sergey Tarasevich
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.shootbox.t_imageloader;

/**
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 */
public final class Constants {

	public static final String[] IMAGES = new String[]{
			// Heavy images
			//新图片
			"http://e.hiphotos.baidu.com/image/pic/item/d1a20cf431adcbef326c603ba8af2edda3cc9fb6.jpg",
			"http://img4.cache.netease.com/photo/0003/2015-10-30/B76P7UNM00AJ0003.jpg",
			"http://img2.cache.netease.com/photo/0003/2015-10-30/B76P818200AJ0003.jpg",
			"http://img4.cache.netease.com/photo/0003/2015-10-30/B76P842I00AJ0003.jpg",
			"http://img3.cache.netease.com/photo/0003/2015-10-30/B76P87H900AJ0003.jpg",
			"http://img4.cache.netease.com/photo/0003/2015-10-30/B76P8ALG00AJ0003.jpg",
			"http://img3.cache.netease.com/photo/0003/2015-10-30/B76P8DHV00AJ0003.jpg",
			"http://p4.so.qhimg.com/t012f4150e8724452f9.jpg",
			"http://p4.so.qhimg.com/t0173731f2bc117219e.jpg",
			"http://p2.so.qhimg.com/t012568461a7f657557.jpg",
			"http://p0.so.qhimg.com/t01fd7fc63f5238b99a.jpg",
			"http://p2.so.qhimg.com/t0179c648c37f0a6d57.jpg",
			"http://p0.so.qhimg.com/t019b5f1664958fb690.jpg",
			"http://p3.so.qhimg.com/t013eb096c8cddfdfa8.jpg",
			"http://p3.so.qhimg.com/t017e5146d0a8faa3d3.jpg",
			"http://p1.so.qhimg.com/t0186c5f4241c147391.jpg",
			"http://p2.so.qhimg.com/t01954d855e7f6f618c.jpg",
			"http://p4.so.qhimg.com/t013deccc2d955812be.jpg",
			"http://p4.so.qhimg.com/t017d522e92b8bb03be.jpg",
			"http://p2.so.qhimg.com/t013ddf414bcc90e987.gif"


			// 旧图片
			// Special cases
			//			"http://cdn.urbanislandz.com/wp-content/uploads/2011/10/MMSposter-large.jpg", // Very large image
			//			"http://4.bp.blogspot.com/-LEvwF87bbyU/Uicaskm-g6I/AAAAAAAAZ2c/V-WZZAvFg5I/s800/Pesto+Guacamole+500w+0268.jpg", // Image with "Mark has been invalidated" problem
			//			"file:///sdcard/Universal Image Loader @#&=+-_.,!()~'%20.png", // Image from SD card with encoded symbols
			//			"assets://Living Things @#&=+-_.,!()~'%20.jpg", // Image from assets
			//			"drawable://" + R.drawable.ic_launcher, // Image from drawables
			//			"http://upload.wikimedia.org/wikipedia/ru/b/b6/Как_кот_с_мышами_воевал.png", // Link with UTF-8
			//			"https://www.eff.org/sites/default/files/chrome150_0.jpg", // Image from HTTPS
			//			"http://bit.ly/soBiXr", // Redirect link
			//			"http://img001.us.expono.com/100001/100001-1bc30-2d736f_m.jpg", // EXIF
			//			"", // Empty link
			//			"http://wrong.site.com/corruptedLink", // Wrong link
	};

	private Constants()
	{
	}

	public static class Config {
		public static final boolean DEVELOPER_MODE = false;
	}

	public static class Extra {
		public static final String IMAGES         = "com.nostra13.example.universalimageloader.IMAGES";
		public static final String IMAGE_POSITION = "com.nostra13.example.universalimageloader.IMAGE_POSITION";
	}
}
