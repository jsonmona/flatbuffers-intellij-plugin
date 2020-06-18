// This is a generated file. Not intended for manual editing.
package io.github.stefansjs.flatbuffersplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.stefansjs.flatbuffersplugin.psi.FlatbuffersTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.stefansjs.flatbuffersplugin.psi.*;

public class FlatbuffersFieldDeclImpl extends ASTWrapperPsiElement implements FlatbuffersFieldDecl {

  public FlatbuffersFieldDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FlatbuffersVisitor visitor) {
    visitor.visitFieldDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlatbuffersVisitor) accept((FlatbuffersVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FlatbuffersFieldType getFieldType() {
    return findChildByClass(FlatbuffersFieldType.class);
  }

  @Override
  @NotNull
  public List<FlatbuffersIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlatbuffersIdent.class);
  }

  @Override
  @Nullable
  public FlatbuffersMetadata getMetadata() {
    return findChildByClass(FlatbuffersMetadata.class);
  }

  @Override
  @Nullable
  public FlatbuffersScalar getScalar() {
    return findChildByClass(FlatbuffersScalar.class);
  }

}
