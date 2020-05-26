// This is a generated file. Not intended for manual editing.
package io.github.stefansjs.flatbuffersplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.stefansjs.flatbuffersplugin.psi.FlatbuffersTypes.*;
import io.github.stefansjs.flatbuffersplugin.psi.ref.FlatbuffersNamedElementImpl;
import io.github.stefansjs.flatbuffersplugin.psi.*;
import io.github.stefansjs.flatbuffersplugin.psi.ref.FlatbuffersNamedElement;

public class FlatbuffersUnionDeclImpl extends FlatbuffersNamedElementImpl implements FlatbuffersUnionDecl {

  public FlatbuffersUnionDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FlatbuffersVisitor visitor) {
    visitor.visitUnionDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlatbuffersVisitor) accept((FlatbuffersVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FlatbuffersDocumentation getDocumentation() {
    return findChildByClass(FlatbuffersDocumentation.class);
  }

  @Override
  @NotNull
  public FlatbuffersIdent getIdent() {
    return findNotNullChildByClass(FlatbuffersIdent.class);
  }

  @Override
  @NotNull
  public List<FlatbuffersUnionvalDecl> getUnionvalDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlatbuffersUnionvalDecl.class);
  }

  @Override
  public String getName() {
    return FlatbuffersPsiImplUtilKt.getName(this);
  }

  @Override
  @NotNull
  public FlatbuffersNamedElement setName(@NotNull String newName) {
    return FlatbuffersPsiImplUtilKt.setName(this, newName);
  }

  @Override
  @NotNull
  public FlatbuffersIdent getNameIdentifier() {
    return FlatbuffersPsiImplUtilKt.getNameIdentifier(this);
  }

}
