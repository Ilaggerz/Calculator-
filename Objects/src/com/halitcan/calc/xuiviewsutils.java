package com.halitcan.calc;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xuiviewsutils {
private static xuiviewsutils mostCurrent = new xuiviewsutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public com.halitcan.calc.main _main = null;
public com.halitcan.calc.starter _starter = null;
public static String  _performhapticfeedback(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(null, "performhapticfeedback", new Object[] {_ba,_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Initialize";
_initialize(_ba);
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="jo.RunMethod(\"performHapticFeedback\", Array(1))";
_jo.RunMethod("performHapticFeedback",new Object[]{(Object)(1)});
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(null, "settextorcsbuildertolabel", new Object[] {_ba,_xlbl,_text}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(anywheresoftware.b4a.BA _ba,b4a.example3.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(null, "addstubtoclvifneeded", new Object[] {_ba,_customlistview1,_color}));}
b4a.example3.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"stub");
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight((int) (_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize()));
 };
RDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(null, "setbitmapandfill", new Object[] {_ba,_imageview,_bmp}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="iiv.Gravity = Gravity.FILL";
_iiv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="End Sub";
return "";
}
public static String  _setalpha(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _level) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setalpha", true))
	 {return ((String) Debug.delegate(null, "setalpha", new Object[] {_ba,_view,_level}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
float _alpha = 0f;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim alpha As Float = Level";
_alpha = _level;
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="jo.RunMethod(\"setAlpha\", Array(alpha))";
_jo.RunMethod("setAlpha",new Object[]{(Object)(_alpha)});
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="End Sub";
return "";
}
public static com.halitcan.calc.b4ximageview  _createb4ximageview(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createb4ximageview", true))
	 {return ((com.halitcan.calc.b4ximageview) Debug.delegate(null, "createb4ximageview", new Object[] {_ba}));}
com.halitcan.calc.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim iv As B4XImageView";
_iv = new com.halitcan.calc.b4ximageview();
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (null,_ba,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"");
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ (null,(Object)(_base.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(((int)0xffaaaaaa)),(Object)("CornersRadius"),(Object)(0)}));
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Return iv";
if (true) return _iv;
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(null, "createlabel", new Object[] {_ba}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub CreateLabel As B4XView";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(_ba,"");
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="End Sub";
return null;
}
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "initialize", true))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="End Sub";
return "";
}
}