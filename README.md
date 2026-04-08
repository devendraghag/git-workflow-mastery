# Git Workflow Mastery

A practical, beginner-friendly Git reference repository that explains core Git commands with simple language, realistic examples, and safe usage tips.

## Who this is for

This repository is for:
- Beginners learning Git from scratch
- Students preparing for interviews
- Developers who want quick command refreshers
- Teams standardizing everyday Git workflows

## What you'll find

Each `git_*.text` file focuses on one command and follows a consistent style:
- What the command does
- Why/when to use it
- Syntax and common options
- Step-by-step examples
- Important warnings and best practices
- Quick summary

## Command Index

### Core basics
- `git_init.text` — initialize a repository
- `git_clone.text` — copy an existing repository
- `git_status.text` — inspect working tree state
- `git_add.text` — stage changes
- `git_commit` *(covered partly in command guides; dedicated file can be added)*
- `git_push.text` — send commits to remote
- `git_pull.text` — fetch + merge from remote
- `git_fetch.text` — download remote updates without merging

### Branching and navigation
- `git_branch.text` — create/list/delete branches
- `git_checkout.text` — switch branches/restore states
- `git_HEAD.text` — understand HEAD and detached HEAD
- `git_stash.text` — temporarily save uncommitted work

### History and recovery
- `git_revert.text` — undo via new commit
- `git_reset.text` — rewrite local history safely
- `git_amend.text` — amend last commit
- `git_cheeryPick.text` — apply specific commit from another branch *(filename typo currently kept for compatibility)*
- `git_tag.text` — label important commits/releases
- `git_prune.text` — clean unreachable Git objects
- `git_clean.text` — remove untracked files safely

## Suggested Learning Path

If you are new to Git, follow this order:

1. `git_init` / `git_clone`
2. `git_status`
3. `git_add`
4. commit flow
5. `git_branch` + `git_checkout`
6. `git_fetch` + `git_pull` + `git_push`
7. `git_stash`
8. `git_revert` + `git_reset`
9. `git_cherry-pick` + `git_tag`
10. cleanup (`git_clean`, `git_prune`)

## Learning Path Outcomes

After completing this repository's learning path, you should be able to:

- Initialize and clone repositories with confidence
- Track file changes, stage updates, and create clean commits
- Work with branches for features and bug fixes
- Sync safely with remotes using fetch, pull, and push
- Recover from mistakes using revert, reset, stash, and amend
- Apply targeted fixes using cherry-pick and tag important milestones
- Clean local workspaces safely with preview-first commands
- Choose safer options for potentially destructive Git operations

## Current Gaps / Roadmap

Planned improvements:
- Add a dedicated `git_commit` guide
- Add mini hands-on labs in an `examples/` folder
- Add quick cheat sheet in Markdown format
- Standardize file naming (`git_<command>.text`) and fix legacy typos with compatibility notes

## How to use this repository

- Open the file for the command you need.
- Read the “IMPORTANT” section before running destructive commands.
- Try examples in a test repository first.
- Prefer safe preview options (`--dry-run`, `--soft`, etc.) where applicable.

## Contributing

Please read [CONTRIBUTING.md](./CONTRIBUTING.md) before submitting changes.

By contributing, you agree to follow our [Code of Conduct](./CODE_OF_CONDUCT.md).

## License

This project is licensed under the MIT License. See [LICENSE](./LICENSE).
