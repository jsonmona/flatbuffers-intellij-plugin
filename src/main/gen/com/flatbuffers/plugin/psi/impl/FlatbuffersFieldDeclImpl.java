// This is a generated file. Not intended for manual editing.
package com.flatbuffers.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.flatbuffers.plugin.psi.FlatbuffersTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.flatbuffers.plugin.psi.*;

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
  @NotNull
  public FlatbuffersFieldType getFieldType() {
    return findNotNullChildByClass(FlatbuffersFieldType.class);
  }

  @Override
  @NotNull
  public List<FlatbuffersIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlatbuffersIdent.class);
  }

  @Override
  @NotNull
  public FlatbuffersMetadata getMetadata() {
    return findNotNullChildByClass(FlatbuffersMetadata.class);
  }

  @Override
  @Nullable
  public FlatbuffersScalar getScalar() {
    return findChildByClass(FlatbuffersScalar.class);
  }

}
