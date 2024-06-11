package org.self.constants;

public class WindowsConstants {

    //创建一个窗口
    int WM_CREATE = 0x01;
    //当一个窗口被破坏时发送
    int WM_DESTROY = 0x02;
    //移动一个窗口
    int WM_MOVE = 0x03;
    //改变一个窗口的大小
    int WM_SIZE = 0x05;
    //一个窗口被激活或失去激活状态
    int WM_ACTIVATE = 0x06;
    //一个窗口获得焦点
    int WM_SET_FOCUS = 0x07;
    //一个窗口失去焦点
    int WM_KILL_FOCUS = 0x08;
    //一个窗口改变成Enable状态
    int WM_ENABLE = 0x0A;
    //设置窗口是否能重画
    int WM_SET_REDRAW = 0x0B;
    //应用程序发送此消息来设置一个窗口的文本
    int WM_SET_TEXT = 0x0C;
    //应用程序发送此消息来复制对应窗口的文本到缓冲区
    int WM_GETTEXT = 0x0D;
    //得到与一个窗口有关的文本的长度（不包含空字符）
    int WM_GET_TEXT_LENGTH = 0x0E;
    //要求一个窗口重画自己
    int WM_PAINT = 0x0F;
    //当一个窗口或应用程序要关闭时发送一个信号
    int WM_CLOSE = 0x10;
    //当用户选择结束对话框或程序自己调用ExitWindows函数
    int WM_QUERY_END_SESSION = 0x11;
    //用来结束程序运行
    int WM_QUIT = 0x12;
    //当用户窗口恢复以前的大小位置时，把此消息发送给某个图标
    int WM_QUERY_OPEN = 0x13;
    //当窗口背景必须被擦除时（例在窗口改变大小时）
    int WM_ERASE_BK_GND = 0x14;
    //当系统颜色改变时，发送此消息给所有顶级窗口
    int WM_SYS_COLOR_CHANGE = 0x15;
    //当系统进程发出WM_QUERY_END_SESSION消息后，此消息发送给应用程序，通知它对话是否结束
    int WM_END_SESSION = 0x16;
    //当隐藏或显示窗口是发送此消息给这个窗口
    int WM_SHOW_WINDOW = 0x18;
    //发此消息给应用程序哪个窗口是激活的，哪个是非激活的
    int WM_ACTIVATE_APP = 0x1C;
    //当系统的字体资源库变化时发送此消息给所有顶级窗口
    int WM_FONT_CHANGE = 0x1D;
    //当系统的时间变化时发送此消息给所有顶级窗口
    int WM_TIME_CHANGE = 0x1E;
    //发送此消息来取消某种正在进行的摸态（操作）
    int WM_CANCEL_MODE = 0x1F;
    //如果鼠标引起光标在某个窗口中移动且鼠标输入没有被捕获时，就发消息给某个窗口
    int WM_SET_CURSOR = 0x20;
    //当光标在某个非激活的窗口中而用户正按着鼠标的某个键发送此消息给当前窗口
    int WM_MOUSE_ACTIVATE = 0x21;
    //发送此消息给MDI子窗口当用户点击此窗口的标题栏，或当窗口被激活，移动，改变大小
    int WM_CHILD_ACTIVATE = 0x22;
    //此消息由基于计算机的训练程序发送，通过WH_JOURNALPALYBACK的hook程序分离出用户输入消息
    int WM_QUEUE_SYNC = 0x23;
    //此消息发送给窗口当它将要改变大小或位置
    int WM_GET_MIN_MAX_INFO = 0x24;
    //发送给最小化窗口当它图标将要被重画
    int WM_PAINT_ICON = 0x26;
    //此消息发送给某个最小化窗口，仅当它在画图标前它的背景必须被重画
    int WM_ICON_ERASE_BK_GND = 0x27;
    //发送此消息给一个对话框程序去更改焦点位置
    int WM_NEXT_DLG_CTL = 0x28;
    //每当打印管理列队增加或减少一条作业时发出此消息
    int WM_SPOOLER_STATUS = 0x2A;
    //当button，combobox，listBox，menu的可视外观改变时发送
    int WM_DRAW_ITEM = 0x2B;
    //当button, combo box, list box, list view control, or menu item 被创建时
    int WM_MEASURE_ITEM = 0x2C;
    //此消息有一个LBS_WANT_KEY_BOARD_INPUT风格的发出给它的所有者来响应WM_KEYDOWN消息
    int WM_V_KEY_TO_ITEM = 0x2E;
    //此消息由一个LBS_WANT_KEY_BOARD_INPUT风格的列表框发送给他的所有者来响应WM_CHAR消息
    int WM_CHAR_TO_ITEM = 0x2F;
    //当绘制文本时程序发送此消息得到控件要用的颜色
    int WM_SET_FONT = 0x30;
    //应用程序发送此消息得到当前控件绘制文本的字体
    int WM_GET_FONT = 0x31;
    //应用程序发送此消息让一个窗口与一个热键相关连
    int WM_SET_HOT_KEY = 0x32;
    //应用程序发送此消息来判断热键与某个窗口是否有关联
    int WM_GET_HOTKEY = 0x33;
    //此消息发送给最小化窗口，当此窗口将要被拖放而它的类中没有定义图标，应用程序能返回一个图标或光标的句柄，当用户拖放图标时系统显示这个图标或光标
    int WM_QUERY_DRAG_ICON = 0x37;
    //发送此消息来判定combobox或listBox新增加的项的相对位置
    int WM_COMPARE_ITEM = 0x39;
    //显示内存已经很少了
    int WM_COMPACTING = 0x41;
    //发送此消息给那个窗口的大小和位置将要被改变时，来调用setWindowPos函数或其它窗口管理函数
    int WM_WINDOW_POS_CHANGING = 0x46;
    //发送此消息给那个窗口的大小和位置已经被改变时，来调用setWindowPos函数或其它窗口管理函数
    int WM_WINDOW_POS_CHANGED = 0x47;
    //当系统将要进入暂停状态时发送此消息
    int WM_POWER = 0x48;
    //当一个应用程序传递数据给另一个应用程序时发送此消息
    int WM_COPY_DATA = 0x4A;
    //当某个用户取消程序日志激活状态，提交此消息给程序
    int WM_CANCEL_JOURNAL = 0x4B;
    //当某个控件的某个事件已经发生或这个控件需要得到一些信息时，发送此消息给它的父窗口
    int WM_NOTIFY = 0x4E;
    //当用户选择某种输入语言，或输入语言的热键改变
    int WM_INPUT_LANG_CHANGE_REQUEST = 0x50;
    //当平台现场已经被改变后发送此消息给受影响的最顶级窗口
    int WM_INPUT_LANG_CHANGE = 0x51;
    //当程序已经初始化windows帮助例程时发送此消息给应用程序
    int WM_T_CARD = 0x52;
    //此消息显示用户按下了F1，如果某个菜单是激活的，就发送此消息个此窗口关联的菜单，否则就发送给有焦点的窗口，如果当前都没有焦点，就把此消息发送给当前激活的窗口
    int WM_HELP = 0x53;
    //当用户已经登入或退出后发送此消息给所有的窗口，当用户登入或退出时系统更新用户的具体设置信息，在用户更新设置时系统马上发送此消息
    int WM_USER_CHANGED = 0x54;
    //公用控件，自定义控件和他们的父窗口通过此消息来判断控件是使用ANSI还是UNICODE结构
    int WM_NOTIFY_FORMAT = 0x55;
    //  当用户某个窗口中点击了一下右键就发送此消息给这个窗口
    //int WM_CONTEXTMENU = ??;
    //当调用SET_WINDOW_LONG函数将要改变一个或多个 窗口的风格时发送此消息给那个窗口
    int WM_STYLE_CHANGING = 0x7C;
    //当调用SET_WINDOW_LONG函数一个或多个 窗口的风格后发送此消息给那个窗口
    int WM_STYLE_CHANGED = 0x7D;
    //当显示器的分辨率改变后发送此消息给所有的窗口
    int WM_DISPLAY_CHANGE = 0x7E;
    //此消息发送给某个窗口来返回与某个窗口有关连的大图标或小图标的句柄
    int WM_GET_ICON = 0x7F;
    //程序发送此消息让一个新的大图标或小图标与某个窗口关联
    int WM_SET_ICON = 0x80;
    //当某个窗口第一次被创建时，此消息在WM_CREATE消息发送前发送
    int WM_NC_CREATE = 0x81;
    //此消息通知某个窗口，非客户区正在销毁
    int WM_NC_DESTROY = 0x82;
    //当某个窗口的客户区域必须被核算时发送此消息
    int WM_NC_CALC_SIZE = 0x83;
    //移动鼠标，按住或释放鼠标时发生
    int WM_NC_HIT_TEST = 0x84;
    //程序发送此消息给某个窗口当它（窗口）的框架必须被绘制时
    int WM_NC_PAINT = 0x85;
    //此消息发送给某个窗口仅当它的非客户区需要被改变来显示是激活还是非激活状态
    int WM_NC_ACTIVATE = 0x86;
    //发送此消息给某个与对话框程序关联的控件，windows控制方位键和TAB键使输入进入此控件通过应
    int WM_GET_DLG_CODE = 0x87;
    //当光标在一个窗口的非客户区内移动时发送此消息给这个窗口 非客户区为：窗体的标题栏及窗 的边框体
    int WM_NC_MOUSE_MOVE = 0xA0;
    //当光标在一个窗口的非客户区同时按下鼠标左键时提交此消息
    int WM_NCL_BUTTON_DOWN = 0xA1;
    //当用户释放鼠标左键同时光标某个窗口在非客户区十发送此消息
    int WM_NCL_BUTTON_UP = 0xA2;
    //当用户双击鼠标左键同时光标某个窗口在非客户区十发送此消息
    int WM_NCL_BUTTON_DBL_CLK = 0xA3;
    //当用户按下鼠标右键同时光标又在窗口的非客户区时发送此消息
    int WM_NCR_BUTTON_DOWN = 0xA4;
    //当用户释放鼠标右键同时光标又在窗口的非客户区时发送此消息
    int WM_NCR_BUTTON_UP = 0xA5;
    //当用户双击鼠标右键同时光标某个窗口在非客户区十发送此消息
    int WM_NCR_BUTTON_DBL_CLK = 0xA6;
    //当用户按下鼠标中键同时光标又在窗口的非客户区时发送此消息
    int WM_NCM_BUTTON_DOWN = 0xA7;
    //当用户释放鼠标中键同时光标又在窗口的非客户区时发送此消息
    int WM_NCM_BUTTON_UP = 0xA8;
    //当用户双击鼠标中键同时光标又在窗口的非客户区时发送此消息
    int WM_NCM_BUTTON_DBL_CLK = 0xA9;
    //WM_KEYDOWN 按下一个键
    int WM_KEYDOWN = 0x0100;
    //释放一个键
    int WM_KEYUP = 0x0101;
    //按下某键，并已发出WM_KEYDOWN， WM_KEYUP消息
    int WM_CHAR = 0x102;
    //当用translate message函数翻译WM_KEYUP消息时发送此消息给拥有焦点的窗口
    int WM_DEAD_CHAR = 0x103;
    //当用户按住ALT键同时按下其它键时提交此消息给拥有焦点的窗口
    int WM_SYS_KEY_DOWN = 0x104;
    //当用户释放一个键同时ALT 键还按着时提交此消息给拥有焦点的窗口
    int WM_SYS_KEY_UP = 0x105;
    //当WM_SYS_KEY_DOWN消息被TRANSLATE MESSAGE函数翻译后提交此消息给拥有焦点的窗口
    int WM_SYS_CHAR = 0x106;
    //当WM_SYS KEY DOWN消息被TRANSLATE MESSAGE函数翻译后发送此消息给拥有焦点的窗口
    int WM_SYS_DEAD_CHAR = 0x107;
    //在一个对话框程序被显示前发送此消息给它，通常用此消息初始化控件和执行其它任务
    int WM_INIT_DIALOG = 0x110;
    //当用户选择一条菜单命令项或当某个控件发送一条消息给它的父窗口，一个快捷键被翻译
    int WM_COMMAND = 0x111;
    //当用户选择窗口菜单的一条命令或当用户选择最大化或最小化时那个窗口会收到此消息
    int WM_SYS_COMMAND = 0x112;
    //发生了定时器事件
    int WM_TIMER = 0x113;
    //当一个窗口标准水平滚动条产生一个滚动事件时发送此消息给那个窗口，也发送给拥有它的控件
    int WM_HSC_ROLL = 0x114;
    //当一个窗口标准垂直滚动条产生一个滚动事件时发送此消息给那个窗口也，发送给拥有它的控件
    int WM_VSC_ROLL = 0x115;
    //当一个菜单将要被激活时发送此消息，它发生在用户菜单条中的某项或按下某个菜单键，它允许程序在显示前更改菜单
    int WM_INIT_MENU = 0x116;
    //当一个下拉菜单或子菜单将要被激活时发送此消息，它允许程序在它显示前更改菜单，而不要改变全部
    int WM_INIT_MENU_POPUP = 0x117;
    //当用户选择一条菜单项时发送此消息给菜单的所有者（一般是窗口）
    int WM_MENU_SELECT = 0x11F;
    //当菜单已被激活用户按下了某个键（不同于加速键），发送此消息给菜单的所有者
    int WM_MENU_CHAR = 0x120;
    //当一个模态对话框或菜单进入空载状态时发送此消息给它的所有者，一个模态对话框或菜单进入空载状态就是在处理完一条或几条先前的消息后没有消息它的列队中等待
    int WM_ENTER_IDLE = 0x121;
    //在windows绘制消息框前发送此消息给消息框的所有者窗口，通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置消息框的文本和背景颜色
    int WM_CTL_COLOR_MSG_BOX = 0x132;
    //当一个编辑型控件将要被绘制时发送此消息给它的父窗口通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置编辑框的文本和背景颜色
    int WM_CTL_COLOR_EDIT = 0x133;

    //当一个列表框控件将要被绘制前发送此消息给它的父窗口通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置列表框的文本和背景颜色
    int WM_CTL_COLOR_LIST_BOX = 0x134;
    //当一个按钮控件将要被绘制时发送此消息给它的父窗口通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置按纽的文本和背景颜色
    int WM_CTL_COLOR_BTN = 0x135;
    //当一个对话框控件将要被绘制前发送此消息给它的父窗口通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置对话框的文本背景颜色
    int WM_CTL_COLOR_DLG = 0x136;
    //当一个滚动条控件将要被绘制时发送此消息给它的父窗口通过响应这条消息，所有者窗口可以通过使用给定的相关显示设备的句柄来设置滚动条的背景颜色
    int WM_CTL_COLOR_SCROLLBAR = 0x137;
    //当一个静态控件将要被绘制时发送此消息给它的父窗口通过响应这条消息，所有者窗口可以 通过使用给定的相关显示设备的句柄来设置静态控件的文本和背景颜色
    int WM_CTL_COLOR_STATIC = 0x138;
    //当鼠标轮子转动时发送此消息个当前有焦点的控件
    int WM_MOUSEWHEEL = 0x20A;
    //双击鼠标中键
    int WM_M_BUTTON_DBL_CLK = 0x209;
    //释放鼠标中键
    int WM_M_BUTTON_UP = 0x208;
    //移动鼠标时发生
    int WM_MOUSEMOVE = 0x200;
    //按下鼠标左键
    int WM_L_BUTTON_DOWN = 0x201;
    //释放鼠标左键
    int WM_L_BUTTON_UP = 0x202;
    //双击鼠标左键
    int WM_L_BUTTON_DBL_CLK = 0x203;
    //按下鼠标右键
    int WM_R_BUTTON_DOWN = 0x204;
    //释放鼠标右键
    int WM_R_BUTTON_UP = 0x205;
    //双击鼠标右键
    int WM_R_BUTTON_DBL_CLK = 0x206;
    //按下鼠标中键
    int WM_M_BUTTON_DOWN = 0x207;

    int WM_USER = 0x0400;
    int MK_L_BUTTON = 0x0001;
    int MK_R_BUTTON = 0x0002;
    int MK_SHIFT = 0x0004;
    int MK_CONTROL = 0x0008;
    int MK_M_BUTTON = 0x0010;
    int MK_X_BUTTON1 = 0x0020;
    int MK_X_BUTTON2 = 0x0040;


}
