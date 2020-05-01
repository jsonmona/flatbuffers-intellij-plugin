/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.flatbuffers.plugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.flatbuffers.plugin.psi.FlatbuffersTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>FlatbuffersLexer.flex</tt>
 */
public class FlatbuffersLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\3\1\0\1\4\5\0\1\61\1\62\1\0\1\7\1\53\1\7\1\13"+
    "\1\24\1\10\1\46\1\51\1\50\1\52\1\6\1\47\1\6\1\45\1\6\1\54\1\56\1\0\1\55\1"+
    "\0\1\65\1\0\4\12\1\14\1\12\11\5\1\15\7\5\1\11\2\5\1\63\1\0\1\64\1\0\1\40\1"+
    "\0\1\17\1\36\1\25\1\30\1\31\1\21\1\44\1\43\1\20\2\5\1\26\1\32\1\16\1\37\1"+
    "\34\1\5\1\35\1\33\1\22\1\27\1\41\1\5\1\42\1\23\1\5\1\57\1\0\1\60\7\0\1\1\32"+
    "\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\1\1\4"+
    "\1\5\5\3\1\1\7\3\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\0"+
    "\1\21\1\22\5\0\10\3\1\23\16\3\1\22\3\0"+
    "\1\24\1\0\1\25\2\3\1\25\1\26\24\3\2\25"+
    "\2\0\3\3\1\27\10\3\1\30\1\31\1\3\1\32"+
    "\4\3\1\33\4\3\1\34\1\35\1\0\1\36\1\0"+
    "\3\3\1\37\1\40\1\41\1\3\1\42\1\3\1\43"+
    "\1\44\1\45\1\46\3\3\1\47\1\3\1\50\2\3"+
    "\1\51\2\3\1\0\10\3\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\2\3\1\0\3\3\1\60\2\3\1\61"+
    "\1\62\2\3\1\0\6\3\1\63\1\64\3\3\1\65"+
    "\5\3\1\66\5\3\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\66\0\66"+
    "\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\242\0\242\0\u04a4\0\u04da\0\u01b0\0\u0510\0\u0546"+
    "\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654\0\u068a\0\u06c0\0\u06f6"+
    "\0\u072c\0\u0762\0\u0798\0\u07ce\0\u0804\0\u083a\0\u0870\0\u08a6"+
    "\0\u08dc\0\u0912\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56"+
    "\0\u0a8c\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u0b64\0\330\0\u0b9a"+
    "\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a"+
    "\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa"+
    "\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e\0\u1074\0\66"+
    "\0\u10aa\0\u10e0\0\u1116\0\u114c\0\u1182\0\u11b8\0\330\0\u11ee"+
    "\0\u1224\0\u125a\0\u1290\0\u12c6\0\u12fc\0\u1332\0\u1368\0\330"+
    "\0\330\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476\0\u14ac\0\330"+
    "\0\u14e2\0\u1518\0\u154e\0\u1584\0\330\0\330\0\u15ba\0\u15f0"+
    "\0\u15f0\0\u1626\0\u165c\0\u1692\0\330\0\330\0\330\0\u16c8"+
    "\0\330\0\u16fe\0\u1734\0\330\0\330\0\330\0\u176a\0\u17a0"+
    "\0\u17d6\0\330\0\u180c\0\330\0\u1842\0\u1878\0\330\0\u18ae"+
    "\0\u18e4\0\u191a\0\u1950\0\u1986\0\u19bc\0\u19f2\0\u1a28\0\u1a5e"+
    "\0\u1a94\0\u1aca\0\330\0\330\0\330\0\330\0\330\0\330"+
    "\0\u1b00\0\u1b36\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e\0\330\0\u1c44"+
    "\0\u1c7a\0\330\0\330\0\u1cb0\0\u1ce6\0\u1d1c\0\u1d52\0\u1d88"+
    "\0\u1dbe\0\u1df4\0\u1e2a\0\u1e60\0\330\0\330\0\u1e96\0\u1ecc"+
    "\0\u1f02\0\330\0\u1f38\0\u1f6e\0\u1fa4\0\u1fda\0\u2010\0\330"+
    "\0\u2046\0\u207c\0\u20b2\0\u20e8\0\u211e\0\330\0\330";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\2\5"+
    "\1\11\2\5\1\12\1\13\1\14\1\15\1\16\1\5"+
    "\1\17\1\5\1\20\1\21\1\22\1\23\1\5\1\24"+
    "\1\5\1\25\1\26\6\5\6\6\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\67\0\3\3\62\0\1\42\2\0\1\42\1\43\61\42"+
    "\5\0\2\5\1\0\3\5\1\0\10\5\1\0\26\5"+
    "\21\0\1\6\1\0\1\6\2\0\1\44\1\45\14\0"+
    "\1\45\13\0\6\6\21\0\1\6\1\0\1\10\2\0"+
    "\1\46\2\0\1\47\1\0\1\50\24\0\6\6\21\0"+
    "\1\6\1\0\1\6\1\51\1\0\1\44\1\45\14\0"+
    "\1\45\10\0\1\51\2\0\6\6\21\0\1\44\1\0"+
    "\1\44\34\0\6\44\20\0\2\5\1\0\3\5\1\0"+
    "\3\5\1\52\4\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\6\5\1\53\1\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\2\5\1\54\5\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\3\5\1\55"+
    "\1\56\3\5\1\0\1\5\1\57\24\5\20\0\2\5"+
    "\1\0\3\5\1\0\3\5\1\60\4\5\1\0\10\5"+
    "\1\61\15\5\37\0\1\62\46\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\12\5\1\63\13\5\20\0\2\5"+
    "\1\0\3\5\1\0\2\5\1\64\1\5\1\65\3\5"+
    "\1\0\1\5\1\66\4\5\1\67\2\5\1\70\14\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\12\5"+
    "\1\71\13\5\20\0\2\5\1\0\3\5\1\0\2\5"+
    "\1\72\5\5\1\0\26\5\20\0\2\5\1\0\3\5"+
    "\1\0\6\5\1\73\1\5\1\0\16\5\1\74\7\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\7\5"+
    "\1\75\2\5\1\76\13\5\20\0\2\5\1\0\3\5"+
    "\1\0\7\5\1\77\1\0\12\5\1\100\13\5\21\0"+
    "\1\44\1\0\1\44\3\0\1\45\14\0\1\45\13\0"+
    "\6\44\21\0\1\101\1\102\1\101\34\0\6\101\32\0"+
    "\1\103\64\0\1\104\55\0\1\105\1\0\1\105\1\0"+
    "\1\105\1\106\1\105\2\0\1\105\1\0\1\105\3\0"+
    "\1\105\2\0\2\105\4\0\1\105\6\0\6\105\20\0"+
    "\2\5\1\0\3\5\1\0\2\5\1\107\5\5\1\0"+
    "\5\5\1\110\20\5\20\0\2\5\1\0\3\5\1\0"+
    "\6\5\1\111\1\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\5\5\1\112\1\113\1\5\1\0\1\114"+
    "\25\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\1\5\1\115\24\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\1\5\1\116\24\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\12\5\1\117\13\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\11\5\1\120"+
    "\14\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\2\5\1\121\23\5\13\0\2\62\1\0\63\62\5\0"+
    "\2\5\1\0\3\5\1\0\2\5\1\122\5\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\4\5\1\123"+
    "\3\5\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\2\5\1\124\5\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\12\5\1\125\13\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\16\5\1\126"+
    "\7\5\20\0\2\5\1\0\3\5\1\0\7\5\1\127"+
    "\1\0\26\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\2\5\1\130\23\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\2\5\1\131\23\5\20\0\2\5"+
    "\1\0\3\5\1\0\10\5\1\0\10\5\1\132\15\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\12\5"+
    "\1\133\13\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\1\134\25\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\12\5\1\135\13\5\20\0\2\5\1\0"+
    "\3\5\1\0\6\5\1\136\1\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\12\5\1\137"+
    "\13\5\21\0\1\101\1\0\1\101\34\0\6\101\31\0"+
    "\1\140\70\0\1\141\52\0\1\105\1\0\1\105\1\0"+
    "\1\105\1\142\1\105\1\143\1\0\1\105\1\0\1\105"+
    "\3\0\1\105\2\0\2\105\2\0\1\143\1\0\1\105"+
    "\6\0\6\105\21\0\1\142\1\0\1\142\1\0\1\142"+
    "\1\0\1\142\2\0\1\142\1\0\1\142\3\0\1\142"+
    "\2\0\2\142\4\0\1\142\6\0\6\142\20\0\2\5"+
    "\1\0\3\5\1\0\10\5\1\0\4\5\1\144\21\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\10\5"+
    "\1\145\15\5\20\0\2\5\1\0\3\5\1\0\4\5"+
    "\1\146\3\5\1\0\26\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\20\5\1\147\1\150\1\151\1\152"+
    "\2\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\1\5\1\153\24\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\6\5\1\154\17\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\4\5\1\155\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\3\5\1\156\4\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\1\5\1\157\24\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\4\5\1\160\21\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\17\5\1\161\6\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\12\5\1\162"+
    "\13\5\20\0\2\5\1\0\3\5\1\0\6\5\1\163"+
    "\1\5\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\2\5\1\164\5\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\12\5\1\165\13\5\20\0"+
    "\2\5\1\0\3\5\1\0\6\5\1\166\1\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\11\5\1\167\14\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\5\5\1\170\20\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\2\5\1\171\23\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\10\5\1\172"+
    "\15\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\13\5\1\173\12\5\20\0\2\5\1\0\3\5\1\0"+
    "\6\5\1\174\1\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\4\5\1\175\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\1\5\1\176"+
    "\24\5\33\0\1\177\53\0\1\142\1\0\1\142\1\0"+
    "\1\142\1\0\1\142\1\143\1\0\1\142\1\0\1\142"+
    "\3\0\1\142\2\0\2\142\2\0\1\143\1\0\1\142"+
    "\6\0\6\142\21\0\1\200\1\201\1\200\34\0\6\200"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\6\5"+
    "\1\202\17\5\20\0\2\5\1\0\3\5\1\0\4\5"+
    "\1\203\3\5\1\0\26\5\20\0\2\5\1\0\3\5"+
    "\1\0\2\5\1\204\5\5\1\0\26\5\20\0\2\5"+
    "\1\0\3\5\1\0\10\5\1\0\22\5\1\205\3\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\25\5"+
    "\1\206\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\24\5\1\207\1\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\2\5\1\210\23\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\4\5\1\211\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\13\5\1\212"+
    "\12\5\20\0\2\5\1\0\3\5\1\0\6\5\1\213"+
    "\1\5\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\4\5\1\214\21\5\20\0\2\5\1\0"+
    "\3\5\1\0\2\5\1\215\5\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\20\5\1\216"+
    "\1\217\1\220\1\221\2\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\17\5\1\222\6\5\20\0\2\5"+
    "\1\0\3\5\1\0\10\5\1\0\10\5\1\223\15\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\4\5"+
    "\1\224\21\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\1\5\1\225\24\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\1\226\25\5\20\0\2\5\1\0"+
    "\3\5\1\0\6\5\1\227\1\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\6\5\1\230"+
    "\17\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\13\5\1\231\12\5\31\0\1\232\55\0\1\200\1\0"+
    "\1\200\34\0\6\200\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\7\5\1\233\16\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\11\5\1\234\14\5\20\0"+
    "\2\5\1\0\3\5\1\0\4\5\1\235\3\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\3\5\1\236\22\5\20\0\2\5\1\0\3\5\1\0"+
    "\4\5\1\237\3\5\1\0\4\5\1\240\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\22\5\1\241"+
    "\1\242\2\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\22\5\1\243\3\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\25\5\1\244\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\24\5\1\245\1\5\20\0"+
    "\2\5\1\0\3\5\1\0\6\5\1\246\1\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\4\5\1\247\21\5\20\0\2\5\1\0\3\5\1\0"+
    "\6\5\1\250\1\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\4\5\1\251\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\6\5\1\252\1\5\1\0"+
    "\26\5\33\0\1\253\52\0\2\5\1\0\3\5\1\0"+
    "\3\5\1\254\4\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\2\5\1\255\23\5\20\0"+
    "\2\5\1\0\3\5\1\0\6\5\1\256\1\5\1\0"+
    "\26\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\4\5\1\257\21\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\3\5\1\260\22\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\15\5\1\261\10\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\25\5\1\262"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\24\5"+
    "\1\263\1\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\10\5\1\264\15\5\20\0\2\5\1\0\3\5"+
    "\1\0\7\5\1\265\1\0\26\5\35\0\1\266\50\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\1\267\25\5"+
    "\20\0\2\5\1\0\3\5\1\0\6\5\1\270\1\5"+
    "\1\0\26\5\20\0\2\5\1\0\3\5\1\0\7\5"+
    "\1\107\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\4\5\1\271\21\5\20\0\2\5\1\0"+
    "\3\5\1\0\6\5\1\272\1\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\14\5\1\273"+
    "\11\5\20\0\2\5\1\0\3\5\1\0\10\5\1\0"+
    "\7\5\1\274\16\5\36\0\1\140\47\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\4\5\1\275\21\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\4\5\1\276"+
    "\21\5\20\0\2\5\1\0\3\5\1\0\2\5\1\277"+
    "\5\5\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\10\5\1\0\4\5\1\300\21\5\20\0\2\5\1\0"+
    "\3\5\1\0\4\5\1\301\3\5\1\0\26\5\20\0"+
    "\2\5\1\0\3\5\1\0\10\5\1\0\4\5\1\302"+
    "\21\5\20\0\2\5\1\0\3\5\1\0\6\5\1\303"+
    "\1\5\1\0\26\5\20\0\2\5\1\0\3\5\1\0"+
    "\2\5\1\304\5\5\1\0\26\5\20\0\2\5\1\0"+
    "\3\5\1\0\10\5\1\0\1\305\25\5\20\0\2\5"+
    "\1\0\3\5\1\0\4\5\1\306\3\5\1\0\26\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\6\5"+
    "\1\307\17\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\4\5\1\310\21\5\20\0\2\5\1\0\3\5"+
    "\1\0\5\5\1\311\2\5\1\0\26\5\20\0\2\5"+
    "\1\0\3\5\1\0\4\5\1\312\3\5\1\0\26\5"+
    "\20\0\2\5\1\0\3\5\1\0\4\5\1\313\3\5"+
    "\1\0\26\5\20\0\2\5\1\0\3\5\1\0\10\5"+
    "\1\0\12\5\1\314\13\5\20\0\2\5\1\0\3\5"+
    "\1\0\10\5\1\0\4\5\1\315\21\5\20\0\2\5"+
    "\1\0\3\5\1\0\2\5\1\316\5\5\1\0\26\5"+
    "\20\0\2\5\1\0\3\5\1\0\10\5\1\0\10\5"+
    "\1\317\15\5\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8532];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\24\1\13\11\1\0\2\1\5\0\30\1"+
    "\3\0\1\1\1\0\31\1\1\11\1\1\2\0\33\1"+
    "\1\0\1\1\1\0\30\1\1\0\20\1\1\0\12\1"+
    "\1\0\31\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public FlatbuffersLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FlatbuffersLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 57: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 58: break;
          case 3: 
            { return IDENTIFIER;
            } 
            // fall through
          case 59: break;
          case 4: 
            { return DEC_INTEGER;
            } 
            // fall through
          case 60: break;
          case 5: 
            { return DOT;
            } 
            // fall through
          case 61: break;
          case 6: 
            { return COMMA;
            } 
            // fall through
          case 62: break;
          case 7: 
            { return COLON;
            } 
            // fall through
          case 63: break;
          case 8: 
            { return EQUALS;
            } 
            // fall through
          case 64: break;
          case 9: 
            { return SEMICOLON;
            } 
            // fall through
          case 65: break;
          case 10: 
            { return LCURLY;
            } 
            // fall through
          case 66: break;
          case 11: 
            { return RCURLY;
            } 
            // fall through
          case 67: break;
          case 12: 
            { return LPAREN;
            } 
            // fall through
          case 68: break;
          case 13: 
            { return RPAREN;
            } 
            // fall through
          case 69: break;
          case 14: 
            { return LBRACK;
            } 
            // fall through
          case 70: break;
          case 15: 
            { return RBRACK;
            } 
            // fall through
          case 71: break;
          case 16: 
            { return QUESTION_MARK;
            } 
            // fall through
          case 72: break;
          case 17: 
            { return STRING_LITERAL;
            } 
            // fall through
          case 73: break;
          case 18: 
            { return DEC_FLOAT;
            } 
            // fall through
          case 74: break;
          case 19: 
            { return COMMENT;
            } 
            // fall through
          case 75: break;
          case 20: 
            { return HEX_INTEGER;
            } 
            // fall through
          case 76: break;
          case 21: 
            { return SPECIAL_FLOAT;
            } 
            // fall through
          case 77: break;
          case 22: 
            { return INT;
            } 
            // fall through
          case 78: break;
          case 23: 
            { return INT8;
            } 
            // fall through
          case 79: break;
          case 24: 
            { return TRUE;
            } 
            // fall through
          case 80: break;
          case 25: 
            { return LONG;
            } 
            // fall through
          case 81: break;
          case 26: 
            { return UINT;
            } 
            // fall through
          case 82: break;
          case 27: 
            { return ENUM;
            } 
            // fall through
          case 83: break;
          case 28: 
            { return BYTE;
            } 
            // fall through
          case 84: break;
          case 29: 
            { return BOOL;
            } 
            // fall through
          case 85: break;
          case 30: 
            { return HEX_FLOAT;
            } 
            // fall through
          case 86: break;
          case 31: 
            { return INT16;
            } 
            // fall through
          case 87: break;
          case 32: 
            { return INT64;
            } 
            // fall through
          case 88: break;
          case 33: 
            { return INT32;
            } 
            // fall through
          case 89: break;
          case 34: 
            { return FALSE;
            } 
            // fall through
          case 90: break;
          case 35: 
            { return FLOAT;
            } 
            // fall through
          case 91: break;
          case 36: 
            { return TABLE;
            } 
            // fall through
          case 92: break;
          case 37: 
            { return UNION;
            } 
            // fall through
          case 93: break;
          case 38: 
            { return UINT8;
            } 
            // fall through
          case 94: break;
          case 39: 
            { return ULONG;
            } 
            // fall through
          case 95: break;
          case 40: 
            { return UBYTE;
            } 
            // fall through
          case 96: break;
          case 41: 
            { return SHORT;
            } 
            // fall through
          case 97: break;
          case 42: 
            { return UINT16;
            } 
            // fall through
          case 98: break;
          case 43: 
            { return UINT64;
            } 
            // fall through
          case 99: break;
          case 44: 
            { return UINT32;
            } 
            // fall through
          case 100: break;
          case 45: 
            { return USHORT;
            } 
            // fall through
          case 101: break;
          case 46: 
            { return DOUBLE;
            } 
            // fall through
          case 102: break;
          case 47: 
            { return STRUCT;
            } 
            // fall through
          case 103: break;
          case 48: 
            { return INCLUDE;
            } 
            // fall through
          case 104: break;
          case 49: 
            { return FLOAT64;
            } 
            // fall through
          case 105: break;
          case 50: 
            { return FLOAT32;
            } 
            // fall through
          case 106: break;
          case 51: 
            { return NAMESPACE;
            } 
            // fall through
          case 107: break;
          case 52: 
            { return ATTRIBUTE;
            } 
            // fall through
          case 108: break;
          case 53: 
            { return ROOT_TYPE;
            } 
            // fall through
          case 109: break;
          case 54: 
            { return RPC_SERVICE;
            } 
            // fall through
          case 110: break;
          case 55: 
            { return FILE_EXTENSION;
            } 
            // fall through
          case 111: break;
          case 56: 
            { return FILE_IDENTIFIER;
            } 
            // fall through
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
