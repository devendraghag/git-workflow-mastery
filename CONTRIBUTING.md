# Contributing Guide

Thanks for your interest in improving **Git Workflow Mastery** 🎉

This repository is intended to be a clear, practical Git learning resource. Please keep contributions beginner-friendly, accurate, and consistent.

## Ways to contribute

You can help by:
- Adding new command guides (e.g., `git_switch`, `git_restore`, `git_remote`)
- Correcting technical inaccuracies
- Improving examples and real-world scenarios
- Fixing typos, formatting, or naming consistency
- Proposing structure improvements for readability

## Content standards

When adding or updating a `git_*.text` file, follow this structure:

1. Title (`GIT XYZ – SIMPLE EXPLANATION`)
2. What it means
3. Why/when to use it
4. Syntax
5. Common commands/options
6. Example walkthrough
7. Real scenario
8. Important warnings
9. Summary

### Writing style

- Use simple English.
- Assume beginner-level readers.
- Keep explanations practical, not overly theoretical.
- Prefer short sections and bullet points.
- Use consistent formatting and separators.

## Accuracy and safety requirements

Please be especially careful with commands that can delete data or rewrite history:
- `git reset`
- `git clean`
- `git push --force`
- `git prune`

For these commands, always include:
- A safe preview step if available (e.g., `--dry-run`)
- A warning about irreversible operations
- A short “when to avoid this” note

## File naming conventions

Use lowercase snake-style naming:
- `git_<command>.text`

Examples:
- `git_rebase.text`
- `git_commit.text`
- `git_cheeryPick.text` *(legacy filename currently in repository)*

If renaming existing files, include backward-compatibility notes in the PR description and update `README.md` in the same PR.

## Local validation checklist

Before opening a PR, confirm:
- [ ] New/updated file follows repository format
- [ ] Command syntax examples are valid
- [ ] Warnings are present for risky commands
- [ ] No contradictory advice across files
- [ ] Spelling and grammar are checked

## Pull request guidelines

When opening a PR:
- Use a clear title (e.g., `docs: add git reset guide`)
- Summarize what changed and why
- Mention any breaking rename/move
- Keep PRs focused (one topic when possible)

## Code of Conduct

By participating, you agree to follow [CODE_OF_CONDUCT.md](./CODE_OF_CONDUCT.md).

## Questions

If anything is unclear, open an issue with:
- What you want to change
- Why it helps learners
- A small sample of the proposed format
