/* GENERATED SOURCE. DO NOT MODIFY. */
/**
 *******************************************************************************
 * Copyright (C) 2001-2013, International Business Machines Corporation and
 * others. All Rights Reserved.
 *******************************************************************************
 */
package android.icu.dev.test.lang;

import android.icu.dev.test.TestFmwk;
import android.icu.lang.UCharacterDirection;
import org.junit.runner.RunWith;
import android.icu.junit.IcuTestFmwkRunner;

/**
* Testing UCharacterDirection
* @author Syn Wee Quek
* @since July 22 2002
*/
@RunWith(IcuTestFmwkRunner.class)
public class UCharacterDirectionTest extends TestFmwk
{    
    // constructor -----------------------------------------------------------
    
    /**
    * Private constructor to prevent initialization
    */
    public UCharacterDirectionTest()
    {
    }
    
    // public methods --------------------------------------------------------
      
    public static void main(String[] arg)  
    {
        try
        {
            UCharacterDirectionTest test = new UCharacterDirectionTest();
            test.run(arg);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
    * Gets the name of the argument category
    * @returns category name
    */
    public void TestToString()
    {
        String name[] = {"Left-to-Right",
                         "Right-to-Left", 
                         "European Number",
                         "European Number Separator",
                         "European Number Terminator",
                         "Arabic Number",
                         "Common Number Separator",
                         "Paragraph Separator",
                         "Segment Separator",
                         "Whitespace",
                         "Other Neutrals",
                         "Left-to-Right Embedding",
                         "Left-to-Right Override",
                         "Right-to-Left Arabic",
                         "Right-to-Left Embedding",
                         "Right-to-Left Override",
                         "Pop Directional Format",
                         "Non-Spacing Mark",
                         "Boundary Neutral",
                         "First Strong Isolate",
                         "Left-to-Right Isolate",
                         "Right-to-Left Isolate",
                         "Pop Directional Isolate",
                         "Unassigned"};
        
        for (int i = UCharacterDirection.LEFT_TO_RIGHT;
            // Placed <= because we need to consider 'Unassigned'
            // when it goes out of bounds of UCharacterDirection
            i <= UCharacterDirection.CHAR_DIRECTION_COUNT; i++) {
             if (!UCharacterDirection.toString(i).equals(name[i])) {
                errln("Error toString for direction " + i + " expected " +
                      name[i]);
             }
        }
    }
}
