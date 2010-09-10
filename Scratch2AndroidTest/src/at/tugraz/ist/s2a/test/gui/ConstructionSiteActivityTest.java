package at.tugraz.ist.s2a.test.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.xmlpull.v1.XmlPullParserException;


import android.app.Dialog;
import android.content.res.XmlResourceParser;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import at.tugraz.ist.s2a.ConstructionSiteActivity;
import at.tugraz.ist.s2a.R;
import at.tugraz.ist.s2a.constructionSite.content.BrickDefine;

public class ConstructionSiteActivityTest extends ActivityInstrumentationTestCase2<ConstructionSiteActivity>{

	private ConstructionSiteActivity mActivity;
	
	private ListView mListView;

	private Button mShowToolBoxButton;
	private Dialog mToolBoxDialog;
	
	private Button mShowObjectDialogButton;
	private Dialog mObjectDialog;
	
	public ConstructionSiteActivityTest() {
		super("at.tugraz.ist.s2a", ConstructionSiteActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		
		//you have to turn this off if any of the test methods send key events to the application
		setActivityInitialTouchMode(false); 
		mActivity = getActivity();
        mListView = (ListView) mActivity.findViewById(at.tugraz.ist.s2a.R.id.MainListView);
        
        mShowToolBoxButton = (Button) mActivity.findViewById(at.tugraz.ist.s2a.R.id.toolbar_button);
        
        
        mShowObjectDialogButton = (Button) mActivity.findViewById(at.tugraz.ist.s2a.R.id.toolbar_button);
        
	}
	
	/**
	 * tests if the scroll bar in the tool box dialog is set to show up as long as expected
	 */
	public void testToolBoxScrollBar(){

		//first approach
		
//		CharSequence filePath = mActivity.getApplicationContext().getResources().getText(R.layout.dialog_toolbox);
		
		
//		StringBuffer xmlStringBuffer = null;
//		try {
//			FileInputStream fis = new FileInputStream(filePath.toString()); 
//			InputStreamReader in = new InputStreamReader(fis, "UTF-8");
//	
//			xmlStringBuffer = new StringBuffer(1024);
//			BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()));
//					
//			char[] chars = new char[1024];
//			int numRead = 0;
//			while( (numRead = reader.read(chars)) > -1){
//				xmlStringBuffer.append(String.valueOf(chars));	
//			}
//	
//			reader.close();
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//		
//		String xmlString = xmlStringBuffer.toString();
//		
//		assertTrue(xmlString.contains("android:scrollbarDefaultDelayBeforeFade=\"2000\""));

		
		//second approach
		
//		XmlResourceParser parser = mActivity.getApplicationContext().getResources().getXml(R.layout.dialog_toolbox);
//		AttributeSet set = Xml.asAttributeSet(parser);
//		
//		
//		int scrollbarDelay = 0;
//		String namespace = parser.getNamespace();
//		
//		try {
//			while(scrollbarDelay == 0){
//				if (parser.getIdAttribute().equals(R.id.toolboxListView))
//						scrollbarDelay = parser.getAttributeIntValue(parser.getNamespace(), "scrollbarDefaultDelayBeforeFade", 0);
//				parser.next();
//			}
//		} catch (XmlPullParserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			Log.e("ConstructionSiteActivityTest", "did not find scrollbar attribute");
//		}
//		
//		
//		assertTrue(scrollbarDelay==2000);
	}
	
//	public void testToolboxShowingUp() {
	
		
		//TODO redesign test case
//		assertTrue(false);
		
//		mActivity.runOnUiThread(
//				new Runnable() {
//					public void run() {
//						mShowToolBoxButton.requestFocus();	
//					}
//				}
//		);
//
//		this.sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
//		
//		try {
//			mToolBoxDialog = (mActivity.getToolboxDialog());
//			assertTrue(mToolBoxDialog.isShowing());
//		} catch (Exception e) {
//			assertTrue(false);
//		}
		
//	}
	
//	public void testContextMenuOnMainList() {
//		mActivity.runOnUiThread(
//				new Runnable() {
//					public void run() {
//						mListView.requestFocus();	
//						
//					}
//				}
//		);
//		if(mListView.getChildCount()>0)
//		{
//		View view = (View) mListView.getChildAt(0);	
//		TouchUtils.longClickView(this, view);
//		this.sendKeys(KeyEvent.KEYCODE_DPAD_DOWN);
//		this.sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
//		}
		//TODO redesign test case
//		assertTrue(false);

		
//		mActivity.runOnUiThread(
//				new Runnable() {
//					public void run() {
//						mListView.requestFocus();	
//						
//					}
//				}
//		);
//		View view = (View) mListView.getChildAt(0);	
//		TouchUtils.longClickView(this, view);
//		this.sendKeys(KeyEvent.KEYCODE_DPAD_DOWN);
//		this.sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
	
//	}
	
	

}
